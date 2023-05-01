package Model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Location {
    private int id;
    private String name;
    private String weatherDescription;
    private String weatherReport;
}
