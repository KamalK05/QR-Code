package com.in.qrcode.application;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.in.qrcode.config.QRCodeConfig;
import com.in.qrcode.constants.QRConstants;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.EnumMap;
import java.util.Objects;

@Service
@NoArgsConstructor
public class QRApplication {
    public ByteArrayOutputStream createQRCode(String dataURL) throws Exception {
        if (Objects.isNull(dataURL) || dataURL.isEmpty()) {
            throw new Exception();
        }

        EnumMap<EncodeHintType, Object> hints = new EnumMap<EncodeHintType, Object>(EncodeHintType.class);
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        hints.put(EncodeHintType.MARGIN, 0);
        QRConstants qrDO = QRCodeConfig.getInstance();

        BitMatrix result = new MultiFormatWriter().encode(dataURL, BarcodeFormat.QR_CODE, qrDO.getQrCodeWidth(), qrDO.getQrCodeWidth(), hints);
        BufferedImage qrImage = MatrixToImageWriter.toBufferedImage(result, getMatrixConfig());

        BufferedImage combined = new BufferedImage(qrImage.getHeight(), qrImage.getWidth(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = (Graphics2D) combined.getGraphics();

        g.drawImage(qrImage, 0, 0, null);
        g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));

        //g.drawImage(logo, (int) Math.round(deltaWidth / 2), (int) Math.round(deltaHeight / 2), null);

        ByteArrayOutputStream pngOutputStream = new ByteArrayOutputStream();
        ImageIO.write(combined, "png", pngOutputStream);
        return pngOutputStream;
    }

    private MatrixToImageConfig getMatrixConfig() {
        return new MatrixToImageConfig(Colors.BLACK.getArgb(), Colors.WHITE.getArgb());
    }

    public enum Colors {
        BLUE(0xFF40BAD0), RED(0xFFE91C43), PURPLE(0xFF8A4F9E), ORANGE(0xFFF4B13D), WHITE(0xFFFFFFFF), BLACK(0xFF000000);
        private final int argb;

        Colors(final int argb) {
            this.argb = argb;
        }

        public int getArgb() {
            return argb;
        }
    }
}
