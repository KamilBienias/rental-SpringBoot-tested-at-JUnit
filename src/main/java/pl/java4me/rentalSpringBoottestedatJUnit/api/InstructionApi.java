package pl.java4me.rentalSpringBoottestedatJUnit.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/instructions")
public class InstructionApi {

    @GetMapping
    public String instruction(){
        return "Witam w moim REST API wypożyczalni produktów.<br><br> " +
                "<span style=\"color:green;\">POBIERANIE</span> produktów i klientów z poziomu PRZEGLĄDARKI lub programu POSTMAN metodą <span style=\"color:red;\">GET</span>:<br>" +
                "<b>1)</b> Aby zobaczyć wszystkie produkty wpisz adres:<br>" +
                "kamil-bienias-rental.herokuapp.com/api/products/all<br>" +
                "<b>2)</b> Aby zobaczyć produkt o id=2 wpisz adres:<br>" +
                "kamil-bienias-rental.herokuapp.com/api/products?id=2<br>" +
                "<b>3)</b> Aby zobaczyć wszystkich klientów wpisz adres:<br>" +
                "kamil-bienias-rental.herokuapp.com/api/customers/all<br>" +
                "<b>4)</b> Aby zobaczyć klienta o id=2 wpisz adres:<br>" +
                "kamil-bienias-rental.herokuapp.com/api/customers?id=2<br><br>" +
                "<span style=\"color:green;\">DODAWANIE</span> produktów i klientów programem POSTMAN.<br>" +
                "<b>1)</b> W celu dodania produktu:<br>" +
                "Wybierz metodę <span style=\"color:red;\">POST</span> i adres kamil-bienias-rental.herokuapp.com/api/products/add<br>" +
                "Następnie z zakładce Body i kropce \"raw\" zmień wartość z Text na JSON. W polu na dole umieść:<br>" +
                "{<br>" +
                "&nbsp&nbsp&nbsp&nbsp\"productName\": \"krawat\",<br>" +
                "&nbsp&nbsp&nbsp&nbsp\"yearOfProduction\": 1989,<br>" +
                "&nbsp&nbsp&nbsp&nbsp\"price\": 24<br>" +
                "}<br>" +
                "<b>2)</b> W celu dodania klienta:<br>" +
                "Wybierz metodę <span style=\"color:red;\">POST</span> i adres kamil-bienias-rental.herokuapp.com/api/customers/add<br>" +
                "Następnie z zakładce Body i kropce \"raw\" zmień wartość z Text na JSON. W polu na dole umieść:<br>" +
                "{<br>" +
                "&nbsp&nbsp&nbsp&nbsp\"firstName\": \"Jan\",<br>" +
                "&nbsp&nbsp&nbsp&nbsp\"lastName\": \"Kowalski\",<br>" +
                "&nbsp&nbsp&nbsp&nbsp\"lastName\": \"87032486577\",<br>" +
                "&nbsp&nbsp&nbsp&nbsp\"dateOfBirth\": \"1987-03-24\"<br>" +
                "}<br><br>" +
                "<span style=\"color:green;\">PRZYPISYWANIE</span> produktu o id=3 dla klienta o id=2 programem POSTMAN.<br>" +
                "Wybierz metodę <span style=\"color:red;\">PUT</span> i adres kamil-bienias-rental.herokuapp.com/api/customers/update?idProduct=3&idCustomer=2<br>" +
                "<br><br>" +
                "<span style=\"color:green;\">USUWANIE</span> produktów i klientów programem POSTMAN.<br> " +
                "<b>1)</b>W celu usunięcia produktu o id=1:<br>" +
                "Wybierz metodę <span style=\"color:red;\">DELETE</span> i adres kamil-bienias-rental.herokuapp.com/api/products/delete/{id}<br>" +
                "<b>2)</b>W celu usunięcia klienta o id=1:<br>" +
                "Wybierz metodę <span style=\"color:red;\">DELETE</span> i adres kamil-bienias-rental.herokuapp.com/api/customers/delete/{id}<br>";
    }
}
