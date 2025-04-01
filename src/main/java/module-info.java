module is.hi.hbv202g.project.slanga {
    requires javafx.controls;
    requires javafx.fxml;

    opens is.hi.hbv202g.project.vidmot to javafx.fxml;
    exports is.hi.hbv202g.project.vidmot;
}
