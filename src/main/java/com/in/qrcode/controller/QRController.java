package com.in.qrcode.controller;

import com.in.qrcode.application.QRApplication;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;

@RestController
@Validated
@NoArgsConstructor
public class QRController {
    @Autowired
    private QRApplication qrApplication;

    @ResponseBody
    @RequestMapping(value = "/v1/qr/code", method = RequestMethod.GET)
    public HttpEntity<byte[]> fetchQRCode(@RequestParam(value = "dataURL") String dataURL) throws Exception {

        ByteArrayOutputStream baos = qrApplication.createQRCode(dataURL);
        byte[] image = baos.toByteArray();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);
        headers.setContentLength(image.length);

        return new HttpEntity<byte[]>(image, headers);
    }
}
