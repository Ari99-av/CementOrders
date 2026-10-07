package manager;

import com.example.service.FileService;
import com.example.order.Order;
import com.example.order.OrderInvoice;
import com.example.parser.OrderParser;
import com.example.parser.OrderParserFactory;
import com.example.service.OrderCalculator;

import java.util.List;

public class OrderManager {
    private final OrderCalculator calculator;
    private final FileService fileService;

    public  OrderManager(FileService fileService, OrderCalculator  calculator){
        this.fileService = fileService;
    this.calculator = calculator;
    }
    public void manage(String readPath, String writePath, double startDiscount, double discountStep,
            double pricePerkg)
            {
        OrderParserFactory factory = new OrderParserFactory();
        OrderParser parser = factory.getParser(readPath);
        List<Order> orders = fileService.read(readPath, parser);
        List<OrderInvoice> invoices = calculator.calculate(orders, startDiscount, discountStep, pricePerkg);
        fileService.write(writePath, invoices);
    }
    }


