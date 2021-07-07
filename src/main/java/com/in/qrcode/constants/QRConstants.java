package com.in.qrcode.constants;

import java.awt.*;

public class QRConstants {

    private int qrCodeWidth, qrCodeoffsetX, qrCodeoffsetY, phoneNumberOffSetX, phoneNumberOffSetY, displayNameRectWidth, displayNameRectHeight, stickerIdOffsetX, stickerIdOffsetY,
            anchorX, anchorY;
    private Font displayNameFont60, displayNameFont45;

    public Font getDisplayNameFont60() {
        return displayNameFont60;
    }

    public void setDisplayNameFont60(Font displayNameFont60) {
        this.displayNameFont60 = displayNameFont60;
    }

    public Font getDisplayNameFont45() {
        return displayNameFont45;
    }

    public void setDisplayNameFont45(Font displayNameFont45) {
        this.displayNameFont45 = displayNameFont45;
    }

    public int getAnchorX() {
        return anchorX;
    }

    public void setAnchorX(int anchorX) {
        this.anchorX = anchorX;
    }

    public int getAnchorY() {
        return anchorY;
    }

    public void setAnchorY(int anchorY) {
        this.anchorY = anchorY;
    }

    public int getQrCodeWidth() {
        return qrCodeWidth;
    }

    public void setQrCodeWidth(int qrCodeWidth) {
        this.qrCodeWidth = qrCodeWidth;
    }

    public int getQrCodeoffsetX() {
        return qrCodeoffsetX;
    }

    public void setQrCodeoffsetX(int qrCodeoffsetX) {
        this.qrCodeoffsetX = qrCodeoffsetX;
    }

    public int getQrCodeoffsetY() {
        return qrCodeoffsetY;
    }

    public void setQrCodeoffsetY(int qrCodeoffsetY) {
        this.qrCodeoffsetY = qrCodeoffsetY;
    }

    public int getPhoneNumberOffSetX() {
        return phoneNumberOffSetX;
    }

    public void setPhoneNumberOffSetX(int phoneNumberOffSetX) {
        this.phoneNumberOffSetX = phoneNumberOffSetX;
    }

    public int getPhoneNumberOffSetY() {
        return phoneNumberOffSetY;
    }

    public void setPhoneNumberOffSetY(int phoneNumberOffSetY) {
        this.phoneNumberOffSetY = phoneNumberOffSetY;
    }

    public int getDisplayNameRectWidth() {
        return displayNameRectWidth;
    }

    public void setDisplayNameRectWidth(int displayNameRectWidth) {
        this.displayNameRectWidth = displayNameRectWidth;
    }

    public int getDisplayNameRectHeight() {
        return displayNameRectHeight;
    }

    public void setDisplayNameRectHeight(int displayNameRectHeight) {
        this.displayNameRectHeight = displayNameRectHeight;
    }

    public int getStickerIdOffsetX() {
        return stickerIdOffsetX;
    }

    public void setStickerIdOffsetX(int stickerIdOffsetX) {
        this.stickerIdOffsetX = stickerIdOffsetX;
    }

    public int getStickerIdOffsetY() {
        return stickerIdOffsetY;
    }

    public void setStickerIdOffsetY(int stickerIdOffsetY) {
        this.stickerIdOffsetY = stickerIdOffsetY;
    }

    @Override
    public String toString() {
        return "QRDO [qrCodeWidth=" + qrCodeWidth + ", qrCodeoffsetX=" + qrCodeoffsetX + ", qrCodeoffsetY=" + qrCodeoffsetY + ", phoneNumberOffSetX=" + phoneNumberOffSetX
                + ", phoneNumberOffSetY=" + phoneNumberOffSetY + ", displayNameRectWidth=" + displayNameRectWidth + ", displayNameRectHeight=" + displayNameRectHeight
                + ", stickerIdOffsetX=" + stickerIdOffsetX + ", stickerIdOffsetY=" + stickerIdOffsetY + ", anchorX=" + anchorX + ", anchorY=" + anchorY + ", displayNameFont60="
                + displayNameFont60 + ", displayNameFont45=" + displayNameFont45 + "]";
    }

}
