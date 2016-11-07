package myprojects.json.prjjason;
/*
Reading and processing a JSON file
*/
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("ClassWithoutLogger")
public class PersonMgmt {
    @SuppressWarnings({"NestedAssignment", "UseOfSystemOutOrSystemErr"})
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Gson jsonObject = new Gson();
        File f = new File("oneperson.json");
        FileReader fin = new FileReader(f);
        BufferedReader buf = new BufferedReader(fin);
        String line;
        @SuppressWarnings("StringBufferWithoutInitialCapacity")
        StringBuilder sb = new StringBuilder();
        while((line = buf.readLine()) != null ) {
            sb.append(line);
        }
        Person onePerson = jsonObject.fromJson(sb.toString(), Person.class);
        System.out.println(String.format("Name %s, Hobbies %s", onePerson.name, onePerson.hobbies));

        //Convertir a JSON
        Gson prettyJSON = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(prettyJSON.toJson(onePerson));
    } 
}