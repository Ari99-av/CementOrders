package com.example.service;
import com.example.exception.FileReadException; import com.example.exception.FileWriteException; import com.example.order.Order; import com.example.order.OrderInvoice; import com.example.parser.OrderParser;
import java.io.IOException; import java.nio.file.Files; import java.nio.file.Path; import java.util.List;
public class FileService {
    public List<Order> read(String filePath, OrderParser parser) {
        try {
            return Files.readAllLines(Path.of(filePath)).stream()
                    .map(parser::parse)
                    .toList();
        } catch (IOException e) {
            throw new FileReadException("Не удалось прочитать файл: " + filePath, e);
        }
    }

    public void write(String filePath, List<OrderInvoice> invoices) {
        try {
            List<String> lines = invoices.stream()
                    .map(OrderInvoice::toString)
                    .toList();
            Files.write(Path.of(filePath), lines);
        } catch (IOException e) {
            throw new FileWriteException("Не удалось прочитать файл: " + filePath, e);
        }
    }
}






