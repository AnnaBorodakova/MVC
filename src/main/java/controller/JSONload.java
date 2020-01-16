package controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import interfaces.IModel;
import model.Firm;


import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class JSONload {
    IModel model;
    public void save() {
       /* try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("exercise.txt"));
            out.writeObject(model.getFirms());
            out.writeObject(model.getTypeExercises());
            out.writeObject(model.getTypeSimulator());
            out.writeObject(model.getTrainings());
            out.writeObject(model.getSimulators());
            out.writeObject(model.getExercises());
            out.close();
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении");
        }*/
        Type type = new TypeToken<ArrayList<Firm>>(){}.getType();
        File file = new File("Firm.exe");
        Gson gson = new Gson();
        String jsonResult = gson.toJson(model.getFirms(),type);
        Writer writer;
        try {
            writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);
            writer.write(jsonResult);
            writer.close();
        }catch (IOException e){
            System.out.println("Ошибка при загрузке");
        }
    }


    public void load() {
        /*try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("exercise.txt"));
            model.setFirms((List<Firm>) in.readObject());
            model.setTypeExercises((List<TypeExercise>) in.readObject());
            model.setTypeSimulators((List<TypeSimulator>) in.readObject());
            model.setTrainings((List<Training>) in.readObject());
            model.setSimulators((List<Simulator>) in.readObject());
            model.setExercises((List<Exercise>) in.readObject());
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при загрузке");
        }*/

        /*StringBuilder jsonStrBuilder = new StringBuilder();
        Scanner inputScanner;
        try{
            inputScanner = new Scanner(new File("example.json"));
            while(inputScanner.hasNext()) // Цикл чтения из файла
                jsonStrBuilder.append(inputScanner.next());
            inputScanner.close();
        }
        catch(FileNotFoundException e){
            System.err.println(e.toString());
        }

        JSONParser jsonParser = new JSONParser();
        JSONObject resultJson; // Объект со всеми данными из JSON файла
        try{
            resultJson = (JSONObject) jsonParser.parse(jsonStrBuilder.toString());
        }
        catch(ParseException e){
            System.err.println(e.toString());
        }

        resultJson = (JSONObject) jsonParser.parse(jsonStrBuilder.toString());
        String objName = (String) resultJson.get("objectName"); // Получаем обычные строковые данные
        String objGuild = resultJson.get("guild").toString(); // Другой способ получить строку

        ArrayList arr = (ArrayList) resultJson.get("idArr"); // Получаем массив
        JSONObject coordsArr = (JSONObject) resultJson.get("coords"); // Получаем сложную JSON структуру
        double objX = (double) coordsArr.get("x"); // Берем координаты из этой структуры
        double objY = (double) coordsArr.get("y"); // Явное приведение к нужному примитивному типу
        */
    }
}