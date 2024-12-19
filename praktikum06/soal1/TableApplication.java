package soal1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TableApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        TableView tabel = new TableView();
        TableColumn<Mahasiswa, String>kolom1 = new TableColumn<>("NIM");
        kolom1.setCellValueFactory(new PropertyValueFactory<>("nama"));
        TableColumn<Mahasiswa, String>kolom2 = new TableColumn<>("NAMA");
        kolom2.setCellValueFactory(new PropertyValueFactory<>("nim"));

        tabel.getColumns().add(kolom1);
        tabel.getColumns().add(kolom2);

        tabel.getItems().add(new Mahasiswa(1, "Ibnu", "2310817210009"));
        tabel.getItems().add(new Mahasiswa(2, "Song Min", "2310817210089"));
        tabel.getItems().add(new Mahasiswa(3, "Kamala", "2310817210035"));
        tabel.getItems().add(new Mahasiswa(4, "Stark", "2310817210007"));
        tabel.getItems().add(new Mahasiswa(5, "Shevira", "2310817210037"));
        tabel.getItems().add(new Mahasiswa(6, "Marc", "2310817210008"));
        tabel.getItems().add(new Mahasiswa(7, "Igor", "2310817210019"));
        tabel.getItems().add(new Mahasiswa(8, "Daren", "2310817210078"));
        tabel.getItems().add(new Mahasiswa(9, "Helena", "2310817210056"));
        tabel.getItems().add(new Mahasiswa(10, "Powder", "2310817210002"));

        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
