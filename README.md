# Introduction
This repository provides an API to generate QR code of desired link. 
This code is written in Java Spring Boot. It contains an API which accepts `dataURL` as content in request parameter and generate QR code for same.
Please check the next section for curl request.
# Sample CURL
``
curl -X GET 'http://localhost:8080/v1/qr/code?dataURL=https://github.com/KamalK05/QR-Code'
``


