/*
 * package com.demo.example;
 * 
 * import java.io.IOException; import java.sql.SQLException; import
 * java.util.ArrayList; import java.util.List;
 * 
 * import javax.xml.parsers.ParserConfigurationException; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.SpringApplication; import
 * org.springframework.boot.autoconfigure.SpringBootApplication; import
 * org.xml.sax.SAXException;
 * 
 * @SpringBootApplication public class IAmigrationApplication {
 * 
 * 
 * 
 * public static void main(String[] args) throws SAXException, IOException,
 * ParserConfigurationException, SQLException {
 * SpringApplication.run(IAmigrationApplication.class, args);
 * 
 * IAMigrate im = new IAMigrate(); List<IATableInfo> myTables = im.migratexml();
 * System.out.println("hiileo"+myTables); MigrationInfo migrationInfo = new
 * MigrationInfo(); migrationInfo.MigrateTable(myTables.get(0));
 * //UserController u =new UserController(); Migration m = new Migration();
 * //System.out.println("9"+m.getAllNames());
 * 
 * 
 * // System.out.println(""+ "o"+u);
 * 
 * } }
 * 
 */