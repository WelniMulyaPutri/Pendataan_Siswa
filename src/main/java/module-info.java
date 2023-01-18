module com.example.pendataan_siswa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pendataan_siswa to javafx.fxml;
    exports com.example.pendataan_siswa;
}