package com.assignment1.assignment1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.*;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Controller {


    @FXML
    private BorderPane borderPane;

    @FXML
    private MenuBar menuBar;

    @FXML
    private MenuItem pieChart;

    @FXML
    private MenuItem table;

    @FXML
    private MenuItem updateData;

    @FXML
    private MenuItem close;

    @FXML
    private TableView<Data> tableView;

    @FXML
    private TableColumn<Data, Integer> index;

    @FXML
    private TableColumn<Data, String> language;

    @FXML
    private TableColumn<Data, Integer> percentage;


    @FXML
    void handleShowPieChart(ActionEvent event) {

        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("python", 25),
                new PieChart.Data("c++", 20),
                new PieChart.Data("java", 36),
                new PieChart.Data("c#", 11),
                new PieChart.Data("php", 8)
        );


        PieChart pieChart = new PieChart(pieChartData);
        pieChart.setTitle("Preferred Languages for jobs in Canada");
        pieChart.setClockwise(true);
        pieChart.setLabelLineLength(50);
        pieChart.setLabelsVisible(true);
        pieChart.setStartAngle(180);

        borderPane.setCenter(pieChart);
    }

    @FXML
    void handleShowTable(ActionEvent event) {
        borderPane.setCenter(null);
        tableView.setVisible(true);
        borderPane.setCenter(tableView);
    }

    @FXML
    void handleClose(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void handleUpdateData(ActionEvent event) {

    }

    ObservableList<Data> data = FXCollections.observableArrayList(
            new Data(1, "python", 25),
            new Data(2, "c++", 20),
            new Data(3, "java", 36),
            new Data(4, "c#", 11),
            new Data(5, "php", 8)
    );

    public void initialize() {

        index.setCellValueFactory(new PropertyValueFactory<Data, Integer>("index"));
        language.setCellValueFactory(new PropertyValueFactory<Data, String>("language"));
        percentage.setCellValueFactory(new PropertyValueFactory<Data, Integer>("percentage"));
        tableView.setItems(data);
    }

}
