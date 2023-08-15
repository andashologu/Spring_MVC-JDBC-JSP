package com.example.springboot.Service;

import java.io.ByteArrayInputStream;

public interface PdfService {
    ByteArrayInputStream convertHtmlToPdf(String htmlContent);
}
