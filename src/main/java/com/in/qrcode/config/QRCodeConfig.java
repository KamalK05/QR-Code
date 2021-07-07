package com.in.qrcode.config;

import com.in.qrcode.constants.QRConstants;

import java.awt.*;

public class QRCodeConfig extends QRConstants {

    private static final String DEFAULT_FONT = "Lucida Bright";

    private static class Loader {
        static QRCodeConfig INSTANCE = new QRCodeConfig();
    }

    public static QRCodeConfig getInstance() {
        return Loader.INSTANCE;
    }

    private QRCodeConfig() {
        setQrCodeWidth(1110);
        setQrCodeoffsetX(10);
        setQrCodeoffsetY(10);
        setDisplayNameRectWidth(1230);
        setDisplayNameRectHeight(1600);
        setStickerIdOffsetX(1780);
        setStickerIdOffsetY(1100);
        setAnchorX(0);
        setAnchorY(0);
        setDisplayNameFont45(new Font(DEFAULT_FONT, Font.BOLD, 45));
        setDisplayNameFont60(new Font(DEFAULT_FONT, Font.BOLD, 60));
    }
}
