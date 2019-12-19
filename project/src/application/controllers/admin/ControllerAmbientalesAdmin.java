package application.controllers.admin;

import application.Main;
import application.Oficinista;
import com.google.gson.reflect.TypeToken;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Tooltip;
import org.json.simple.JSONObject;

import java.lang.reflect.Type;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.TreeMap;


public class ControllerAmbientalesAdmin implements Initializable {
    @FXML
    LineChart<String,Number> ambientAdmin;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        switch(ControllerVistaAdmin.selectAmb){ //Carga de los linechart en funcion del tipo de ambiental
            case 1:{
                ambientAdmin.getData().clear();
                XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
                Type tempsHMType = new TypeToken<TreeMap<String,Double>>(){}.getType();
                TreeMap <String, Double> temperaturas = Main.gson.fromJson(String.valueOf(Main.ambientales.get("Temperatura")), tempsHMType);
                temperaturas.keySet().forEach(keyStr ->
                {
                    Number keyvalue = (Number) temperaturas.get(keyStr);
                    series.getData().add(new XYChart.Data<String, Number>((String) keyStr, keyvalue));
                    series.setName("Temperatura");
                });
                ambientAdmin.getData().add(series);
                for (final XYChart.Data<String, Number> data : series.getData()) {
                    Tooltip.install(data.getNode(), new Tooltip("X : " + data.getXValue() + "\n Y : " + data.getYValue())); //ToolTip XY Nodos
                }
            }
            break;
            case 2:{
                ambientAdmin.getData().clear();
                XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
                Type tempsHMType = new TypeToken<TreeMap<String,Double>>(){}.getType();
                TreeMap <String, Double> temperaturas = Main.gson.fromJson(String.valueOf(Main.ambientales.get("Humedad")), tempsHMType);
                temperaturas.keySet().forEach(keyStr ->
                {
                    Number keyvalue = (Number) temperaturas.get(keyStr);
                    series.getData().add(new XYChart.Data<String, Number>((String) keyStr, keyvalue));
                    series.setName("Humedad");
                });
                ambientAdmin.getData().add(series);
                for (final XYChart.Data<String, Number> data : series.getData()) {
                    Tooltip.install(data.getNode(), new Tooltip("X : " + data.getXValue() + "\n Y : " + data.getYValue())); //ToolTip XY Nodos
                }
            }
            break;
            case 3:{
                ambientAdmin.getData().clear();
                XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
                Type tempsHMType = new TypeToken<TreeMap<String,Double>>(){}.getType();
                TreeMap <String, Double> temperaturas = Main.gson.fromJson(String.valueOf(Main.ambientales.get("Luminosidad")), tempsHMType);
                temperaturas.keySet().forEach(keyStr ->
                {
                    Number keyvalue = (Number) temperaturas.get(keyStr);
                    series.getData().add(new XYChart.Data<String, Number>((String) keyStr, keyvalue));
                    series.setName("Luminosidad");
                });
                ambientAdmin.getData().add(series);
                for (final XYChart.Data<String, Number> data : series.getData()) {
                    Tooltip.install(data.getNode(), new Tooltip("X : " + data.getXValue() + "\n Y : " + data.getYValue())); //ToolTip XY Nodos
                }
            }
            break;
            case 4:{
                ambientAdmin.getData().clear();
                XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
                Type tempsHMType = new TypeToken<TreeMap<String,Double>>(){}.getType();
                TreeMap <String, Double> temperaturas = Main.gson.fromJson(String.valueOf(Main.ambientales.get("Aire")), tempsHMType);
                temperaturas.keySet().forEach(keyStr ->
                {
                    Number keyvalue = (Number) temperaturas.get(keyStr);
                    series.getData().add(new XYChart.Data<String, Number>((String) keyStr, keyvalue));
                    series.setName("Aire");
                });
                ambientAdmin.getData().add(series);
                for (final XYChart.Data<String, Number> data : series.getData()) {
                    Tooltip.install(data.getNode(), new Tooltip("X : " + data.getXValue() + "\n Y : " + data.getYValue())); //ToolTip XY Nodos
                }
            }
            break;
            case 5:{
                ambientAdmin.getData().clear();
                XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
                Type tempsHMType = new TypeToken<TreeMap<String,Double>>(){}.getType();
                TreeMap <String, Double> temperaturas = Main.gson.fromJson(String.valueOf(Main.ambientales.get("Ruido")), tempsHMType);
                temperaturas.keySet().forEach(keyStr ->
                {
                    Number keyvalue = (Number) temperaturas.get(keyStr);
                    series.getData().add(new XYChart.Data<String, Number>((String) keyStr, keyvalue));
                    series.setName("Ruido");
                });
                ambientAdmin.getData().add(series);
                for (final XYChart.Data<String, Number> data : series.getData()) {
                    Tooltip.install(data.getNode(), new Tooltip("X : " + data.getXValue() + "\n Y : " + data.getYValue())); //ToolTip XY Nodos
                }
            }

        }
    }
}