package pl.java4me.rentalSpringBoottestedatJUnit.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class InstructionApi {

    @GetMapping
    public String instruction(){
        return "<h2>Witam w REST API wypożyczalni produktów.</h2>" +
                "<ol>" +
                "   <li>" +
                "   <span style=\"color:green;\">POBIERANIE</span> produktów i klientów z poziomu PRZEGLĄDARKI lub programu POSTMAN metodą <span style=\"color:red;\">GET</span>:" +
                "       <ul>" +
                "           <li>Aby zobaczyć wszystkie produkty wpisz adres:<br>" +
                "               kamil-bienias-rental.herokuapp.com/api/products/get/all</li>" +
                "           <li>Aby zobaczyć produkt o id=2 wpisz adres:<br>" +
                "               kamil-bienias-rental.herokuapp.com/api/products/get/2</li>" +
                "           <li>Aby zobaczyć wszystkich klientów wpisz adres:<br>" +
                "               kamil-bienias-rental.herokuapp.com/api/customers/get/all</li>" +
                "           <li>Aby zobaczyć klienta o id=2 wpisz adres:<br>" +
                "               kamil-bienias-rental.herokuapp.com/api/customers/get/2</li>" +
                "       </ul>" +
                "   </li>" +
                "   <br>" +
                "   <li>" +
                "   <span style=\"color:green;\">DODAWANIE</span> produktów i klientów programem POSTMAN.<br>" +
                "       <ul>" +
                "           <li>" +
                "               W celu dodania produktu wybierz metodę <span style=\"color:red;\">POST</span> i adres:<br>" +
                "               kamil-bienias-rental.herokuapp.com/api/products/add<br>" +
                "               Następnie z zakładce Body i kropce \"raw\" zmień wartość z Text na JSON. W polu na dole umieść:<br>" +
                "               {<br>" +
                "                   &nbsp&nbsp&nbsp&nbsp\"productName\": \"krawat\",<br>" +
                "                   &nbsp&nbsp&nbsp&nbsp\"yearOfProduction\": 1989,<br>" +
                "                   &nbsp&nbsp&nbsp&nbsp\"price\": 24<br>" +
                "               }" +
                "           </li>" +
                "           <li>" +
                "               W celu dodania klienta wybierz metodę <span style=\"color:red;\">POST</span> i adres:<br>" +
                "               kamil-bienias-rental.herokuapp.com/api/customers/add<br>" +
                "               Następnie z zakładce Body i kropce \"raw\" zmień wartość z Text na JSON. W polu na dole umieść:<br>" +
                "               {<br>" +
                "                   &nbsp&nbsp&nbsp&nbsp\"firstName\": \"Jan\",<br>" +
                "                   &nbsp&nbsp&nbsp&nbsp\"lastName\": \"Kowalski\",<br>" +
                "                   &nbsp&nbsp&nbsp&nbsp\"lastName\": \"87032486577\",<br>" +
                "                   &nbsp&nbsp&nbsp&nbsp\"dateOfBirth\": \"1987-03-24\"<br>" +
                "               }" +
                "           </li>" +
                "       </ul>" +
                "   </li>" +
                "   <br>" +
                "   <li>" +
                "   <span style=\"color:green;\">PRZYPISYWANIE</span> produktu dla klienta programem POSTMAN.<br>" +
                "       <ul>" +
                "           <li>" +
                "               Aby przypisać produkt o id=3 dla klienta o id=2 programem POSTMAN wybierz metodę <span style=\"color:red;\">PUT</span> i adres:<br>" +
                "               kamil-bienias-rental.herokuapp.com/api/customers/update?idProduct=3&idCustomer=2" +
                "           </li>" +
                "       </ul>" +
                "   </li>" +
                "   <br>" +
                "   <li>" +
                "   <span style=\"color:green;\">USUWANIE</span> produktów i klientów programem POSTMAN.<br> " +
                "       <ul>" +
                "           <li>" +
                "               W celu usunięcia produktu o id=1 wybierz metodę <span style=\"color:red;\">DELETE</span> i adres:<br>" +
                "               kamil-bienias-rental.herokuapp.com/api/products/delete/1" +
                "           </li>" +
                "           <li>" +
                "               W celu usunięcia klienta o id=1 wybierz metodę <span style=\"color:red;\">DELETE</span> i adres:<br>" +
                "               kamil-bienias-rental.herokuapp.com/api/customers/delete/1" +
                "           </li>" +
                "       </ul>" +
                "</ol>";
    }
}
