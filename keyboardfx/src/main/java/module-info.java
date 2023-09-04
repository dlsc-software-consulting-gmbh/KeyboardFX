module com.dlsc.keyboardfx {
    requires transitive javafx.controls;
    requires java.xml.bind;

    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.materialdesign;
    requires java.logging;
    requires org.controlsfx.controls;

    exports com.dlsc.keyboardfx;

    opens com.dlsc.keyboardfx;
}