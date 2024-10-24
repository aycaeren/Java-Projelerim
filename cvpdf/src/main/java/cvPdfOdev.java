package org.example;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.io.image.ImageDataFactory;

import java.io.IOException;

public class cvPdfOdev {

    public static void main(String[] args) {
        String dest = "resume.pdf";
        String photoPath = "src/main/resources/3E0854AB-AAC9-4C09-94F7-C7D3B8BA0E1E.jpg";

        try {
            PdfWriter writer = new PdfWriter(dest);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            document.add(new Paragraph("CV")
                    .setFontSize(24)
                    .setBold()
                    .setTextAlignment(TextAlignment.CENTER));

            // Fotoğraf ekle
            Image img = new Image(ImageDataFactory.create(photoPath));
            img.scaleToFit(100, 100);
            img.setTextAlignment(TextAlignment.CENTER);
            document.add(img);

            // Kişisel Bilgiler
            document.add(new Paragraph("Kisisel Bilgiler").setBold().setFontSize(15));
            document.add(new Paragraph("Ad : Ayca EREN"));
            document.add(new Paragraph("E-posta : erenayca371@gmail.com"));
            document.add(new Paragraph("Lin%kedln : www.linkedin.com/in/ayca-eren-32385a295"));
            document.add(new Paragraph("Telefon : 0543 629 4744"));
            document.add(new Paragraph("Adres : Istabul - Bahcelievler"));
            document.add(new Paragraph("\n"));

            // Eğitim Bilgileri
            document.add(new Paragraph("Egitim Bilgileri").setBold().setFontSize(15));
            document.add(new Paragraph("Okul : Kirklareli Universitesi"));
            document.add(new Paragraph("Bolum : Yazilim Muhendsiligi"));
            document.add(new Paragraph("\n"));

            // İş Deneyimi
            document.add(new Paragraph("Is Deneyimi").setBold().setFontSize(15));
            document.add(new Paragraph("Sirket : Is Bankasi"));
            document.add(new Paragraph("Görev : IOS Developer"));
            document.add(new Paragraph("Baslangıc - Bitis Tarihi : 2024 - Halen"));
            document.add(new Paragraph("\n"));

            document.add(new Paragraph("Sirket : Etkin Kampüs"));
            document.add(new Paragraph("Görev : Kampüs Temsilcisi"));
            document.add(new Paragraph("Baslangıc - Bitis Tarihi : 2024 - Halen"));

            document.add(new Paragraph("\n"));
            document.add(new Paragraph("Sirket : Ayer Yazilim"));
            document.add(new Paragraph("Görev : IOS Developer"));
            document.add(new Paragraph("Baslangıc - Bitis Tarihi : 2023 - 2024"));

            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}