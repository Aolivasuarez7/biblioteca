package com.biblio.biblioteca;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.util.Callback;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.*;
import javax.swing.*;
import java.io.File;
import java.util.regex.Pattern;

public class HelloController implements Initializable {

    @FXML
    private Button btAceptar;

    @FXML
    private Button btAceptarAutorAdmin;

    @FXML
    private Button btAceptarLibroAdmin;

    @FXML
    private Button btCerrarUsuario;

    @FXML
    private Button btReservarLibroAdmin;

    @FXML
    private Button btCrearUsuario;

    @FXML
    private Button btEliminarUsuario;

    @FXML
    private Button btModificarAutorAdmin;

    @FXML
    private Button btModificarLibroAdmin;

    @FXML
    private Button btVerAutores;

    @FXML
    private Button btSalirAutorAdmin;

    @FXML
    private Button btCrearAutores;

    @FXML
    private Button btModificarUsuario;

    @FXML
    private Button btEliminaAutorAdmin;

    @FXML
    private DatePicker dpFecNacAutorAdmin;

    @FXML
    private Label lbApellidoUsuario;

    @FXML
    private Label lbApellidosAutorAdmin;

    @FXML
    private Label lbAutorLibrosAdmin;

    @FXML
    private Label lbBiografiaAutorAdmin;

    @FXML
    private Label lbBuscarLibrosAdmin;

    @FXML
    private Label lbContrasena;

    @FXML
    private Label lbDniUsuario;

    @FXML
    private Label lbEmail;

    @FXML
    private Label lbFecAltaUsuario;

    @FXML
    private Label lbFecNacAutorAdmin;

    @FXML
    private Label lbFecnNaUsuario;

    @FXML
    private Label lbGeneroLibrosAdmin;

    @FXML
    private Label lbIsbnLibroAdmin;

    @FXML
    private Label lbNomUsuarios;

    @FXML
    private Label lbNombreAutorAdmin;

    @FXML
    private Label lbNumPagLibroAdmin;

    @FXML
    private Label lbSinopsisLibrosAdmin;

    @FXML
    private Label lbTelfUsuario;

    @FXML
    private Label lbTituloLibrosAdmin;

    @FXML
    private Label lbUsuario;

    @FXML
    private Pane pAdministrador;

    @FXML
    private Pane pAgregarUsuarioAdmin;

    @FXML
    private Pane pDatosAutores;

    @FXML
    private Pane pDatosLibros;

    @FXML
    private Pane pPrincipalLibros;

    @FXML
    private Pane pPassword;

    @FXML
    private Pane pPrincipal1;

    @FXML
    private Pane pPrincipalUsuariosAdmin;

    @FXML
    private PasswordField passFieldContrase;

    @FXML
    private Tab tabAutoresAdmin;

    @FXML
    private Tab tabLibrosAdmin;

    @FXML
    private Tab tabUsuarioAdmin;

    @FXML
    private Pane pAutoresPrincipal;

    @FXML
    private TabPane tabPanelAdmin;


    @FXML
    private TableView<ObservableList> tableAutores;

    @FXML
    private TableView<ObservableList> tableLibrosAdmin;

    @FXML
    private TableView<ObservableList> tableUsuariosAdmin;

    @FXML
    private TextField txfApellidoUsuario;

    @FXML
    private TextField txfApellidosAutorAdmin;

    @FXML
    private TextField txfAutorLibrosAdmin;

    @FXML
    private TextField txfBuscarUsuarios;

    @FXML
    private TextField txfBiografiaAutorAdmin;

    @FXML
    private TextField txfBuscarLibrosAdmin;

    @FXML
    private TextField txfDniUsuario;

    @FXML
    private TextField txfEmailUsuario;

    @FXML
    private DatePicker txfFecAltaUsuario;

    @FXML
    private DatePicker txfFecNacUsuario;

    @FXML
    private TextField txfGeneroLibrosAdmin;


    @FXML
    private Button btVueltaBiblio;

    @FXML
    private Pane pCojaLibro;

    @FXML
    private Button btLibros;

    @FXML
    private Button btMisLibros;

    @FXML
    private Button btPerfil;

    @FXML
    private ImageView imgCodeLibro;

    @FXML
    private ImageView imgHardcodeUsuario;

    @FXML
    private FlowPane imgPane;

    @FXML
    private TextField lAutorLibro;

    @FXML
    private TextField lGeneroLibro;

    @FXML
    private Label lHarcodeLibroAutor;

    @FXML
    private Label lHardCodeLibroTitulo;

    @FXML
    private TextField lIdlibro;

    @FXML
    private TextField lIsbnLibro;

    @FXML
    private TextField lPaginasLibro;

    @FXML
    private TextField lTituloLibro;



    @FXML
    private AnchorPane pDatos;

    @FXML
    private AnchorPane pDatos1;

    @FXML
    private Pane pInicioUsuario;


    @FXML
    private FlowPane pVistosRecientemente;


    @FXML
    private ScrollPane scrollPane;

    @FXML
    private GridPane gridPane;
    @FXML
    private TextField txfUsuario;
    @FXML
    private TextField tBuscaLibro;
    @FXML
    private TabPane tabPane;

    @FXML
    private Button volverTodosLibros;

    @FXML
    private TextField txfIsbnLibroAdmin;

    @FXML
    private TextField txfNombreAutorAdmin;

    @FXML
    private TextField txfNombreUsuario;

    @FXML
    private TextField txfNumPagLibroAdmin;

    @FXML
    private TextField txfSinopsisLibrosAdmin;

    @FXML
    private TextField txfTelefonoUsuario;

    @FXML
    private TextField txfTituloLibrosAdmin;



    @FXML
    private ComboBox<String> cbAutorLibros;

    @FXML
    private ComboBox<String> cbGeneroLibros;

    @FXML
    private ImageView imgLibro;

    private String enlaceImg;



    public static Connection conBD() throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mariadb://localhost:3307/bd_biblio", "root", "DAM2122");
    }

    @FXML
    void CambiaPanel(ActionEvent event) {
        if (Objects.equals(txfUsuario.getText(), "Admin") & Objects.equals(passFieldContrase.getText(), "Admin")){
            pPassword.setVisible(false);
            pAdministrador.setVisible(true);
        }else if (Objects.equals(txfUsuario.getText(), "Usuario") & Objects.equals(passFieldContrase.getText(), "Usuario")){
            pPrincipal1.setVisible(true);
            pPassword.setVisible(false);
        }
    }




    @FXML
    void goToAutores(ActionEvent event) {
        tabPanelAdmin.getSelectionModel().select(tabAutoresAdmin);
    }

    @FXML
    void goToLibros(ActionEvent event) {
        tabPanelAdmin.getSelectionModel().select(tabLibrosAdmin);
    }

    @FXML
    void goToUsuarios(ActionEvent event) {
        tabPanelAdmin.getSelectionModel().select(tabUsuarioAdmin);
    }


    public String creaUsuarios(String nombre,String apellidos){
        StringBuilder sb = new StringBuilder();
        sb.append(nombre.substring(0, 1).toLowerCase());
        sb.append(apellidos.toLowerCase());
        return sb.toString();
    }


    //Gesti??n usuario
    @FXML
    public String recogeUrl() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecciona un archivo");
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            enlaceImg = selectedFile.getAbsolutePath();
            System.out.println(enlaceImg);

        }
        Image image = new Image(enlaceImg);
        imgLibro.setImage(image);
        return enlaceImg;
    }

    @FXML
    void insertaUsuario(ActionEvent event) {
        String nombre;
        String apellidos;
        String dni;
        java.sql.Date fechaNac;
        int telefono;
        java.sql.Date fechaAlta;
        String usuarioProvisional;
        String mail;

        try {
            nombre = txfNombreUsuario.getText();
            apellidos = txfApellidoUsuario.getText();
            dni = txfDniUsuario.getText();
            fechaNac = Date.valueOf(txfFecNacUsuario.getValue());
            telefono = Integer.parseInt(txfTelefonoUsuario.getText());
            usuarioProvisional = creaUsuarios(nombre,apellidos);
            fechaAlta = Date.valueOf(txfFecAltaUsuario.getValue());

            mail = txfEmailUsuario.getText();

            PreparedStatement encapsulaPSCons = conBD().prepareStatement("INSERT INTO clientes values(null,?,?,?,?,?,?,?,?)");
            encapsulaPSCons.setString(1,nombre);
            encapsulaPSCons.setString(2,apellidos);
            encapsulaPSCons.setString(3,dni);
            encapsulaPSCons.setDate(4,fechaNac);
            encapsulaPSCons.setInt(5,telefono);
            encapsulaPSCons.setDate(6,fechaAlta);
            encapsulaPSCons.setString(7,usuarioProvisional);
            encapsulaPSCons.setString(8,mail);

            //Actualiza
            encapsulaPSCons.executeUpdate();
            limpiaDatosUsuario();

            //cierra panel
            pAgregarUsuarioAdmin.setVisible(false);
            pPrincipalUsuariosAdmin.setVisible(true);

            agregaFilas("clientes",tableUsuariosAdmin);



            //Cierra las conexiones
            encapsulaPSCons.close();
            conBD().close();

            //Crea un nuevo paciente y lo a??ade a la lista

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void ModificaUsuario(ActionEvent event) {
        String nombre;
        String apellidos;
        String dni;
        java.sql.Date fechaNac;
        int telefono;
        java.sql.Date fechaAlta;
        String usuarioProvisional;
        String mail;

        try {
            ObservableList<String>data = tableUsuariosAdmin.getSelectionModel().getSelectedItem();
            Object value = null;
            value = data.get(0);


            nombre = txfNombreUsuario.getText();
            apellidos = txfApellidoUsuario.getText();
            dni = txfDniUsuario.getText();
            fechaNac = Date.valueOf(txfFecNacUsuario.getValue());
            telefono = Integer.parseInt(txfTelefonoUsuario.getText());
            usuarioProvisional = creaUsuarios(nombre,apellidos);
            fechaAlta = Date.valueOf(txfFecAltaUsuario.getValue());

            mail = txfEmailUsuario.getText();

            PreparedStatement encapsulaPSCons = conBD().prepareStatement("update clientes set nombre = ?,apellidos = ?,dni = ?,fechaNacimiento = ?,telefono = ?,fechaAlta = ?,userBiblio = ?,mail = ? where idCliente = ?");
            encapsulaPSCons.setString(1,nombre);
            encapsulaPSCons.setString(2,apellidos);
            encapsulaPSCons.setString(3,dni);
            encapsulaPSCons.setDate(4,fechaNac);
            encapsulaPSCons.setInt(5,telefono);
            encapsulaPSCons.setDate(6,fechaAlta);
            encapsulaPSCons.setString(7,usuarioProvisional);
            encapsulaPSCons.setString(8,mail);
            encapsulaPSCons.setObject(9,value);

            //Actualiza
            encapsulaPSCons.executeUpdate();
            limpiaDatosUsuario();

            //cierra panel
            pAgregarUsuarioAdmin.setVisible(false);
            pPrincipalUsuariosAdmin.setVisible(true);

            agregaFilas("clientes",tableUsuariosAdmin);



            //Cierra las conexiones
            encapsulaPSCons.close();
            conBD().close();

            //Crea un nuevo paciente y lo a??ade a la lista

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void eliminarIngreso(ActionEvent event) {

        System.out.println("entra");
        try {
            ObservableList<String> data;
            Object value = null;
            data = tableUsuariosAdmin.getSelectionModel().getSelectedItem();
            value = data.get(0);
            System.out.println(value);
            Connection con = conBD();
            PreparedStatement ps = con.prepareStatement("DELETE FROM clientes where idCliente=?");
            ps.setObject(1, value);

            ps.executeUpdate();

            agregaFilas("clientes",tableUsuariosAdmin);
            cerrarDatosUsuario();
            conBD().close();
            cerrarDatosUsuario();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void limpiaDatosUsuario(){
        {
            txfNombreUsuario.setText("");
            txfApellidoUsuario.setText("");
            txfDniUsuario.setText("");
            txfFecNacUsuario.setValue(null);
            txfTelefonoUsuario.setText("");
            txfFecAltaUsuario.setValue(null);
            txfEmailUsuario.setText("");
        }

    }

    @FXML
    public void verFichaUsuario(){
        ObservableList<String>data = tableUsuariosAdmin.getSelectionModel().getSelectedItem();

        btCrearUsuario.setVisible(false);
        btEliminarUsuario.setVisible(true);
        btModificarUsuario.setVisible(true);

        pPrincipalUsuariosAdmin.setVisible(false);
        pAgregarUsuarioAdmin.setVisible(true);


        controllerTableIngresos(data);
    }

    @FXML
    void verNuevoUsuario(ActionEvent event) {
        limpiaDatosUsuario();
        pPrincipalUsuariosAdmin.setVisible(false);
        pAgregarUsuarioAdmin.setVisible(true);
        btCrearUsuario.setVisible(true);
        btEliminarUsuario.setVisible(false);
        btModificarUsuario.setVisible(false);
    }

    @FXML
    void cerrarDatosUsuario(ActionEvent event) {
        pPrincipalUsuariosAdmin.setVisible(true);
        pAgregarUsuarioAdmin.setVisible(false);
    }

    void cerrarDatosUsuario() {
        pPrincipalUsuariosAdmin.setVisible(true);
        pAgregarUsuarioAdmin.setVisible(false);
    }


    public void BuscaUsuarios() {
        String buscarLibro = txfBuscarUsuarios.getText();
        String regex = "(?i)" + buscarLibro; // (?i) para hacer la busqueda insensible a mayusculas/minusculas
        Pattern pattern = Pattern.compile(regex);

        try {
            Statement stmt = conBD().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT idlibro,titulo,enlaceImg FROM libros WHERE titulo REGEXP '" + regex + "' ");


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //Gesti??n Autores

    @FXML
    void insertaAutor(ActionEvent event) {
        String nombre;
        String apellidos;
        java.sql.Date fechaNac;
        String biografia;

        try {
            nombre = txfNombreAutorAdmin.getText();
            apellidos = txfApellidosAutorAdmin.getText();
            fechaNac = Date.valueOf(dpFecNacAutorAdmin.getValue());
            biografia = txfBiografiaAutorAdmin.getText();

            PreparedStatement encapsulaPSCons = conBD().prepareStatement("INSERT INTO autores values(null,?,?,?,?)");
            encapsulaPSCons.setString(1,nombre);
            encapsulaPSCons.setString(2,apellidos);
            encapsulaPSCons.setDate(3,fechaNac);
            encapsulaPSCons.setString(4,biografia);


            //Actualiza
            encapsulaPSCons.executeUpdate();
            limpiaDatosUsuario();

            //cierra panel
            pDatosAutores.setVisible(false);
            pAutoresPrincipal.setVisible(true);

            agregaFilas("autores",tableAutores);
            datosAutorComboBox();
            //Cierra las conexiones
            encapsulaPSCons.close();
            conBD().close();

            //Crea un nuevo paciente y lo a??ade a la lista

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void ModificaAutor(ActionEvent event) {
        String nombre;
        String apellidos;
        java.sql.Date fechaNac;
        String biografia;


        try {
            nombre = txfNombreAutorAdmin.getText();
            apellidos = txfApellidosAutorAdmin.getText();
            fechaNac = Date.valueOf(dpFecNacAutorAdmin.getValue());
            biografia = txfBiografiaAutorAdmin.getText();

            ObservableList<String>data =tableAutores.getSelectionModel().getSelectedItem();
            Object value = null;
            value = data.get(0);


            PreparedStatement encapsulaPSCons = conBD().prepareStatement("update autores set nombre = ?,apellidos = ?,fechaNacimiento = ?,biografia = ? where idAutor = ?");

            encapsulaPSCons.setString(1,nombre);
            encapsulaPSCons.setString(2,apellidos);
            encapsulaPSCons.setDate(3,fechaNac);
            encapsulaPSCons.setString(4,biografia);
            encapsulaPSCons.setObject(5,value);


            //Actualiza
            encapsulaPSCons.executeUpdate();
            limpiaDatosUsuario();

            //cierra panel
            pDatosAutores.setVisible(false);
            pAutoresPrincipal.setVisible(true);

            agregaFilas("autores",tableAutores);


            //Cierra las conexiones
            encapsulaPSCons.close();
            conBD().close();

            //Crea un nuevo paciente y lo a??ade a la lista

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void eliminarAutor(ActionEvent event) {

        try {
            ObservableList<String> data;
            Object value = null;
            data = tableAutores.getSelectionModel().getSelectedItem();
            value = data.get(0);
            Connection con = conBD();
            PreparedStatement ps = con.prepareStatement("DELETE FROM autores where idAutor=?");
            ps.setObject(1, value);

            ps.executeUpdate();

            agregaFilas("autores",tableAutores);

            conBD().close();

            cerrarDatosAutor();


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void verFichaAutor(){
        ObservableList<String>data = tableAutores.getSelectionModel().getSelectedItem();

        btCrearUsuario.setVisible(false);
        btEliminarUsuario.setVisible(true);
        btModificarUsuario.setVisible(true);

        pAutoresPrincipal.setVisible(false);
        pDatosAutores.setVisible(true);


        controllerTableAutores(data);
    }

    @FXML
    void verNuevoAutor(ActionEvent event) {

        limpiaDatosAutor();
        pAutoresPrincipal.setVisible(false);
        pDatosAutores.setVisible(true);

    }

    @FXML
    void cerrarDatosAutor(ActionEvent event) {
        pAutoresPrincipal.setVisible(true);
        pDatosAutores.setVisible(false);
    }

    void cerrarDatosAutor() {
        pAutoresPrincipal.setVisible(true);
        pDatosAutores.setVisible(false);
    }

    public void limpiaDatosAutor(){
        {
            txfNombreAutorAdmin.setText("");
            txfApellidosAutorAdmin.setText("");
            dpFecNacAutorAdmin.setValue(null);
            txfBiografiaAutorAdmin.setText("");
        }

    }

    @FXML
    void filtroAutores(InputMethodEvent event) {

    }
    /**
     * Gesti??n Libros
     */
    @FXML
    void verDatosLibro(ActionEvent event) {
        ObservableList<String>data = tableLibrosAdmin.getSelectionModel().getSelectedItem();
        pDatosLibros.setVisible(true);
        pPrincipalLibros.setVisible(false);
        controllerTableLibros(data);
    }

    @FXML
    void insertaLibros(ActionEvent event) {
        String titulo;
        int numPaginas;
        int idAutor;
        int idGenero;
        int isbn;
        int cantidadLibros;

        try {
            titulo = txfTituloLibrosAdmin.getText();
            numPaginas = Integer.parseInt(txfNumPagLibroAdmin.getText());
            idAutor = Integer.parseInt((cbAutorLibros.getValue().split(","))[0]);
            idGenero = Integer.parseInt((cbGeneroLibros.getValue().split(","))[0]);
            isbn = Integer.parseInt(txfIsbnLibroAdmin.getText());
            cantidadLibros = Integer.parseInt(txfSinopsisLibrosAdmin.getText());
            InputStream ub = new FileInputStream(enlaceImg);

            PreparedStatement encapsulaPSCons = conBD().prepareStatement("INSERT INTO libros values(null,?,?,?,?,?,?,?)");
            encapsulaPSCons.setString(1,titulo);
            encapsulaPSCons.setInt(2,numPaginas);
            encapsulaPSCons.setInt(3,idAutor);
            encapsulaPSCons.setInt(4,idGenero);
            encapsulaPSCons.setInt(5,isbn);
            encapsulaPSCons.setBlob(6,ub);
            encapsulaPSCons.setInt(7,cantidadLibros);

            //Actualiza
            encapsulaPSCons.executeUpdate();

            //cierra panel

            agregaFilasLibros("libros",tableLibrosAdmin);

            //Cierra las conexiones
            encapsulaPSCons.close();
            conBD().close();

            //Crea un nuevo paciente y lo a??ade a la lista
            pDatosLibros.setVisible(false);
            pPrincipalLibros.setVisible(true);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void modificaLibros(ActionEvent event) {
        String titulo;
        int numPaginas;
        int idAutor;
        int idGenero;
        int isbn;

        try {
            titulo = txfTituloLibrosAdmin.getText();
            numPaginas = Integer.parseInt(txfNumPagLibroAdmin.getText());
            idAutor = Integer.parseInt((cbAutorLibros.getValue().split(","))[0]);
            idGenero = Integer.parseInt((cbGeneroLibros.getValue().split(","))[0]);
            isbn = Integer.parseInt(txfIsbnLibroAdmin.getText());
            InputStream ub = new FileInputStream(enlaceImg);

            ObservableList<String>data = tableAutores.getSelectionModel().getSelectedItem();
            Object value = null;
            value = data.get(0);

            PreparedStatement encapsulaPSCons = conBD().prepareStatement("update libros set titulo = ?,numPaginas = ?,idAutor = ?,idGenero = ?,isbn = ?,enlaceImg = ?, cantidadLibros = ? where IdLibro = ?");
            encapsulaPSCons.setString(1,titulo);
            encapsulaPSCons.setInt(2,numPaginas);
            encapsulaPSCons.setInt(3,idAutor);
            encapsulaPSCons.setInt(4,idGenero);
            encapsulaPSCons.setInt(5,isbn);
            encapsulaPSCons.setBlob(6,ub);
            encapsulaPSCons.setObject(7,value);

            //Actualiza
            encapsulaPSCons.executeUpdate();

            //cierra panel

            agregaFilasLibros("libros",tableLibrosAdmin);

            //Cierra las conexiones
            encapsulaPSCons.close();
            conBD().close();

            //Crea un nuevo paciente y lo a??ade a la lista

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void eliminarLibro(ActionEvent event) {

        try {
            ObservableList<String> data;
            Object value = null;
            data = tableLibrosAdmin.getSelectionModel().getSelectedItem();
            value = data.get(0);
            Connection con = conBD();
            PreparedStatement ps = con.prepareStatement("DELETE FROM libros where idLibro=?");
            ps.setObject(1, value);

            ps.executeUpdate();

            agregaFilasLibros("libros",tableLibrosAdmin);
            cerrarDatosLibros();
            conBD().close();


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void verNuevoLibro(ActionEvent event) {

        pPrincipalLibros.setVisible(false);
        pDatosLibros.setVisible(true);

    }

    @FXML
    void cerrarDatosLibros(ActionEvent event) {
        pPrincipalLibros.setVisible(true);
        pDatosLibros.setVisible(false);
    }

    void cerrarDatosLibros() {
        pPrincipalLibros.setVisible(true);
        pDatosLibros.setVisible(false);
    }


    /**
     * Gesti??n Reservas
     */
    @FXML
    public  int devuelveIDUsuario(){
        int idUsuario = 0;
        String nombreUsuario = JOptionPane.showInputDialog("Inserta el nombre de usuario");
        try {
            Statement s = conBD().createStatement();
            ResultSet rs = s.executeQuery("select idCliente from clientes where userBiblio ="+"'"+nombreUsuario+"'");

            if (rs.next()) {
                idUsuario = rs.getInt(1);
            }

        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }

        System.out.println(idUsuario);

        return idUsuario;
    }

    public  int devuelveCantidadLibro(Object value){
        int cantidadLibros = 0;

        try {
            Statement s = conBD().createStatement();
            ResultSet rs = s.executeQuery("select cantidadLibros from libros where IdLibro = "+ value);

            if (rs.next()) {
                cantidadLibros = rs.getInt(1);
            }

        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }

        System.out.println(cantidadLibros);

        return cantidadLibros;
    }

    @FXML
    public void restaCantidadLibros(Object value){
        int numLibros = devuelveCantidadLibro(value) - 1;

        try {
            PreparedStatement encapsulaPSCons = conBD().prepareStatement("update libros set cantidadLibros = ? where IdLibro = ?");
            encapsulaPSCons.setInt(1,numLibros);
            encapsulaPSCons.setObject(2,value);
            //Actualiza
            encapsulaPSCons.executeUpdate();

            //cierra panel


            //Cierra las conexiones
            encapsulaPSCons.close();
            conBD().close();


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void insertaReserva(ActionEvent event) {
        int idCliente;
        java.sql.Date fechaPrestamo;
        int idLibro;
        ObservableList<String>data = tableLibrosAdmin.getSelectionModel().getSelectedItem();
        Object value = null;
        value = data.get(0);
        try {
            fechaPrestamo = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            idCliente = devuelveIDUsuario();

            PreparedStatement encapsulaPSCons = conBD().prepareStatement("INSERT INTO prestamos values(null,?,?,?)");
            encapsulaPSCons.setInt(1,idCliente);
            encapsulaPSCons.setDate(2,fechaPrestamo);
            encapsulaPSCons.setObject(3,value);


            //Actualiza
            encapsulaPSCons.executeUpdate();

            //cierra panel



            //Cierra las conexiones
            encapsulaPSCons.close();
            conBD().close();

            //Crea un nuevo paciente y lo a??ade a la lista
            pDatosLibros.setVisible(false);
            pPrincipalLibros.setVisible(true);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        restaCantidadLibros(data);
    }



    /**
     * Controladores ComboBox
     * Inserta los datos nombre apellidos e id en los comboBox correspondientes
     */

    public void datosAutorComboBox() {
        cbAutorLibros.getItems().clear();
        try {
            Statement s = conBD().createStatement();
            ResultSet rs = s.executeQuery("select * from autores");

            String auxNombre;
            String auxApellidos;
            String codAutor;
            while (rs.next()) {
                byte[] dataNombre = rs.getBytes("nombre");
                auxNombre = new String(dataNombre, StandardCharsets.UTF_8);
                byte[] dataApellidos = rs.getBytes("apellidos");
                auxApellidos = new String(dataApellidos, StandardCharsets.UTF_8);

                int dataId= rs.getInt("idautor");
                String nue = String.valueOf(dataId);

                cbAutorLibros.getItems().add(nue +","+ auxNombre + " " + auxApellidos);
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void datosGeneroComboBox() {
        cbGeneroLibros.getItems().clear();
        try {
            Statement s = conBD().createStatement();
            ResultSet rs = s.executeQuery("select * from genero");

            String auxNombre;
            while (rs.next()) {
                byte[] dataNombre = rs.getBytes("nomGenero");
                auxNombre = new String(dataNombre, StandardCharsets.UTF_8);
                int dataId= rs.getInt("idGenero");
                String nue = String.valueOf(dataId);

                cbGeneroLibros.getItems().add(nue +","+ auxNombre);
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }


    //Introduce  los datos de autor y genero en los combo box a la hora de consultar los datos de un libro
    public String datosConsultaLibroComboBox(Object value) {
        String resultado = null;
        try {
            Statement s = conBD().createStatement();
            ResultSet rs = s.executeQuery("select * from genero where idGenero = (select idGenero from libros where IdLibro = " + value+")");

            String auxNombre;
            while (rs.next()) {
                byte[] dataNombre = rs.getBytes("nomGenero");
                auxNombre = new String(dataNombre, StandardCharsets.UTF_8);
                int dataId= rs.getInt("idGenero");
                String nue = String.valueOf(dataId);
                resultado = nue +","+ auxNombre;
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
        return resultado;
    }

    public String datosConsultaLibroComboBox2(Object value) {
        String resultado = null;
        try {
            Statement s = conBD().createStatement();
            ResultSet rs = s.executeQuery("select * from autores where idAutor = (select idAutor from libros where IdLibro = " + value+")");

            String auxNombre;
            String auxApellidos;
            while (rs.next()) {
                byte[] dataNombre = rs.getBytes("nombre");
                byte[] dataApellidos = rs.getBytes("apellidos");
                auxNombre = new String(dataNombre, StandardCharsets.UTF_8);
                auxApellidos = new String(dataApellidos, StandardCharsets.UTF_8);
                int dataId= rs.getInt("idAutor");
                String nue = String.valueOf(dataId);
                resultado = nue +","+ auxNombre + " "+ auxApellidos ;
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
        return resultado;
    }



    // Controladores Tablas

    private void controllerTableIngresos(ObservableList<String>data) {
        Object value = null;
        value = data.get(0);
        System.out.println(value);

        try {
            Statement s = conBD().createStatement();
            ResultSet rs = s.executeQuery("select * from clientes where idCliente = " + value);
            if (rs.next()) {
                txfNombreUsuario.setText(rs.getObject(2).toString());
                txfApellidoUsuario.setText(rs.getObject(3).toString());
                txfDniUsuario.setText(rs.getObject(4).toString());
                txfFecNacUsuario.setValue(LocalDate.parse(String.valueOf(rs.getObject(5))));
                txfTelefonoUsuario.setText(rs.getObject(6).toString());
                txfFecAltaUsuario.setValue(LocalDate.parse(rs.getObject(7).toString()));
                txfEmailUsuario.setText(rs.getObject(8).toString());
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }

    private void controllerTableAutores(ObservableList<String>data) {
        Object value = null;
        value = data.get(0);
        System.out.println(value);
        try {
            Statement s = conBD().createStatement();
            ResultSet rs = s.executeQuery("select * from autores where idAutor = " + value);

            if (rs.next()) {
                txfNombreAutorAdmin.setText(rs.getObject(2).toString());
                txfApellidosAutorAdmin.setText(rs.getObject(3).toString());
                dpFecNacAutorAdmin.setValue(LocalDate.parse(String.valueOf(rs.getObject(4))));
                txfBiografiaAutorAdmin.setText(rs.getObject(5).toString());
            }

        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }

    private void controllerTableLibros(ObservableList<String>data) {
        Object value = null;
        value = data.get(0);
        System.out.println(value);

        try {
            Statement s = conBD().createStatement();
            ResultSet rs = s.executeQuery("select * from libros where IdLibro = " + value);
            int contador = 0;
            if (rs.next()) {
                contador++;
                System.out.println(contador + rs.toString());
                txfTituloLibrosAdmin.setText(rs.getObject(2).toString());
                txfNumPagLibroAdmin.setText(rs.getObject(3).toString());
                cbGeneroLibros.setValue(datosConsultaLibroComboBox(value));
                cbAutorLibros.setValue(datosConsultaLibroComboBox2(value));

                txfIsbnLibroAdmin.setText(rs.getObject(6).toString());
                InputStream fis = rs.getBinaryStream(7);
                //Seteando Imagen
                Image image = new Image(fis);
                imgLibro.setImage(image);

            }



        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * Construye las filas de la tabla e inserta los datos
     * @param nomTabla nombre de la tabla a reflejar
     * @param tabla componente tableview donde se escribir?? dicha informaci??n
     */

    public void agregaFilas(String nomTabla, TableView tabla){
        ObservableList<ObservableList> data;
        Connection c ;
        data = FXCollections.observableArrayList();
        try{
            c = conBD();

            String SQL = "SELECT * from " + nomTabla;
            ResultSet rs = c.createStatement().executeQuery(SQL);

            while(rs.next()){
                //Iterate Row
                ObservableList<String> row = FXCollections.observableArrayList();
                for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                    //Iterate Column
                    row.add(rs.getString(i));
                }
                System.out.println("Row [1] added "+row );
                data.add(row);

            }

            tabla.setItems(data);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error on Building Data");
        }
    }

    public void agregaFilasLibros(String nomTabla, TableView tabla){
        ObservableList<ObservableList> data;
        Connection c ;
        data = FXCollections.observableArrayList();
        try{
            c = conBD();

            String SQL = "SELECT idlibro, titulo,numPaginas,idAutor,idGenero,isbn,cantidadLibros from " + nomTabla;
            ResultSet rs = c.createStatement().executeQuery(SQL);

            while(rs.next()){
                //Iterate Row
                ObservableList<String> row = FXCollections.observableArrayList();
                for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                    //Iterate Column
                    row.add(rs.getString(i));
                }
                System.out.println("Row [1] added "+row );
                data.add(row);

            }

            tabla.setItems(data);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error on Building Data");
        }
    }


    @FXML
    void muestraBoton(MouseEvent event) {
        btVerAutores.setVisible(true);
    }
    /**
     * Construye la tabla e inserta los datos
     * @param nomTabla nombre de la tabla a reflejar
     * @param tabla componente tableview donde se escribir?? dicha informaci??n
     */
    public void construyeDatos(String nomTabla, TableView tabla){

        ObservableList<ObservableList> data;
        Connection c ;
        data = FXCollections.observableArrayList();
        try{
            c = conBD();
            String SQL = "SELECT * from " + nomTabla;
            ResultSet rs = c.createStatement().executeQuery(SQL);

            for(int i =0 ; i<rs.getMetaData().getColumnCount(); i++){
                //We are using non property style for making dynamic table
                final int j = i;
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i+1));
                col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList,String>, ObservableValue<String>>(){
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {
                        return new SimpleStringProperty(param.getValue().get(j).toString());
                    }
                });
                tabla.getColumns().addAll(col);
                if(i==0){
                    col.setVisible(false);
                }
                System.out.println("Column ["+i+"] ");
            }
            while(rs.next()){
                //Iterate Row
                ObservableList<String> row = FXCollections.observableArrayList();
                for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                    //Iterate Column
                    row.add(rs.getString(i));
                }
                System.out.println("Row [1] added "+row );
                data.add(row);
            }
            //FINALLY ADDED TO TableView
            tabla.setItems(data);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error on Building Data");
        }
    }

    public void construyeDatosTablaLibros(String nomTabla, TableView tabla){

        ObservableList<ObservableList> data;
        Connection c ;
        data = FXCollections.observableArrayList();
        try{
            c = conBD();
            String SQL = "SELECT idlibro, titulo,numPaginas,idAutor,idGenero,isbn,cantidadLibros from " + nomTabla;
            ResultSet rs = c.createStatement().executeQuery(SQL);

            for(int i =0 ; i<rs.getMetaData().getColumnCount(); i++){
                //We are using non property style for making dynamic table
                final int j = i;
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i+1));
                col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList,String>, ObservableValue<String>>(){
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {
                        return new SimpleStringProperty(param.getValue().get(j).toString());
                    }
                });
                tabla.getColumns().addAll(col);
                if(i==0){
                    col.setVisible(false);
                }
            }
            while(rs.next()){
                //Iterate Row
                ObservableList<String> row = FXCollections.observableArrayList();
                for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                    //Iterate Column
                    row.add(rs.getString(i));
                }
                data.add(row);
                System.out.println(data);
            }
            //FINALLY ADDED TO TableView
            tabla.setItems(data);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private Label label;

    @FXML
    void todosLibros(ActionEvent event) {
        imgPane.getChildren().clear();
        insertaImg();
        volverTodosLibros.setVisible(false);
        tBuscaLibro.setText("");
    }

    @FXML
    void volveraBiblio(ActionEvent event) {
        pCojaLibro.setVisible(false);
        pPrincipal1.setVisible(true);
    }

    @FXML
    void busquedaRegexText(ActionEvent event) {

        buscarLibros();
        volverTodosLibros.setVisible(true);
    }


    @FXML
    void veaPerfil(ActionEvent event) {
        tabPane.getSelectionModel().select(3);
    }

    @FXML
    void veaLibro(ActionEvent event) {
        tabPane.getSelectionModel().select(1);
    }

    @FXML
    void veaMisLibros(ActionEvent event) {
        tabPane.getSelectionModel().select(2);
    }


    void scrolling() {
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
    }


    void buscarLibros() {
        String buscarLibro = tBuscaLibro.getText();
        String regex = "(?i)" + buscarLibro; // (?i) para hacer la busqueda insensible a mayusculas/minusculas
        Pattern pattern = Pattern.compile(regex);

        try {
            Statement stmt = conBD().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT idlibro,titulo,enlaceImg FROM libros WHERE titulo REGEXP '" + regex + "' ");

            while (rs.next()) {
                //Cogiendo datos
                int idLibro = rs.getInt(1);
                String dis = rs.getString(2);
                InputStream fis = rs.getBinaryStream(3);

                System.out.println(dis);

                Pane pane = getPane(dis, fis);

                //Cambiando a panel informacion
                muestraDatos(stmt, idLibro, dis, pane);

            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    void panePerfil (){

    }

    private Pane getPane(String dis, InputStream fis) {
        imgPane.getChildren().clear();
        //Seteando Imagen
        Image image = new Image(fis);
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(250);
        imageView.setFitWidth(170);
        imageView.setImage(image);

        //Seteando Textos
        label = new Label(dis);
        label.setFont(new Font("Lato", 20));

        //Creando VBox
        GridPane gridPane = new GridPane();
        Pane pane = new Pane();
        VBox imagBox = new VBox();
        VBox tituBox = new VBox();
        VBox geneVBox = new VBox();
        imagBox.getChildren().add(imageView);
        tituBox.getChildren().add(label);
        geneVBox.getChildren().addAll(imagBox, tituBox);
        pane.getChildren().add(geneVBox);
        pane.setPadding(new Insets(20, 20, 20, 20));
        gridPane.getChildren().add(pane);


        //A??adiendo a panel
        imgPane.getChildren().add(gridPane);
        return pane;
    }

    void insertaImg() {

        try {
            Statement stmt = conBD().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT idlibro,titulo,enlaceImg,idautor from libros");
            while (rs.next()) {
                //Cogiendo datos
                int idLibro = rs.getInt(1);
                String dis = rs.getString(2);
                InputStream fis = rs.getBinaryStream(3);
                Pane pane = getPane2(dis, fis);
                muestraDatos(stmt, idLibro, dis, pane);
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    private Pane getPane2(String dis, InputStream fis) {
        System.out.println(dis);

        //Seteando Imagen
        Image image = new Image(fis);
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(250);
        imageView.setFitWidth(170);
        imageView.setImage(image);

        //Seteando Textos
        label = new Label(dis);
        label.setFont(new Font("Lato", 20));

        //Creando VBox
        GridPane gridPane = new GridPane();
        Pane pane = new Pane();
        VBox imagBox = new VBox();
        VBox tituBox = new VBox();
        VBox geneVBox = new VBox();
        imagBox.getChildren().add(imageView);
        tituBox.getChildren().add(label);
        geneVBox.getChildren().addAll(imagBox, tituBox);
        pane.getChildren().add(geneVBox);
        pane.setPadding(new Insets(20, 20, 20, 20));
        gridPane.getChildren().add(pane);


        //A??adiendo a panel
        imgPane.getChildren().add(gridPane);
        return pane;
    }

    private void muestraDatos(Statement stmt, int idLibro, String dis, Pane pane) {
        //Cambiando a panel informacion
        pane.setOnMouseClicked(e -> {
            pCojaLibro.setVisible(true);
            System.out.println(dis);
            System.out.println(idLibro);
            try {
                ResultSet st = stmt.executeQuery("SELECT * from libros where idlibro= " + idLibro);
                while (st.next()) {
                    int idlibro = st.getInt("IdLibro");
                    String titulo = st.getString("titulo");
                    int numPag = st.getInt("numPaginas");
                    int idautor = st.getInt("idAutor");
                    int idgenero = st.getInt("idGenero");
                    int isbn = st.getInt("isbn");
                    Blob enlaceImg = st.getBlob("enlaceImg");

                    lIdlibro.setText(String.valueOf(idlibro));
                    lTituloLibro.setText(titulo);
                    lAutorLibro.setText(String.valueOf(idautor));
                    lIsbnLibro.setText(String.valueOf(isbn));
                    lGeneroLibro.setText(String.valueOf(idgenero));
                    lPaginasLibro.setText(String.valueOf(numPag));

                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

        });
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {

        construyeDatos("clientes", tableUsuariosAdmin);
        construyeDatos("autores",tableAutores);
        construyeDatosTablaLibros("libros",tableLibrosAdmin);



        datosAutorComboBox();
        datosGeneroComboBox();
        insertaImg();
        scrolling();




    }
}

