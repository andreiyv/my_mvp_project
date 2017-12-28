package ru.andreyv.my_di_project;

import android.app.Application;

import ru.andreyv.my_di_project.Dagger.DaggerPostavshik_Objektov_Component;
import ru.andreyv.my_di_project.Dagger.LoadDataModule;
import ru.andreyv.my_di_project.Dagger.Postavshik_Objektov_Component;
import ru.andreyv.my_di_project.Dagger.SetStringModule;

/**
 * Created by voran on 12/26/17.
 */

public class DI extends Application {

    private static Postavshik_Objektov_Component postavshik_objektov_component;

    @Override
    public void onCreate() {
        super.onCreate();

        // Каждый component необходимо инициализировать подобным образом (не обязательно в классе Application)
        postavshik_objektov_component = DaggerPostavshik_Objektov_Component
                .builder()
                .setStringModule(new SetStringModule())
                .loadDataModule(new LoadDataModule())
                .build();


    }

    public static Postavshik_Objektov_Component getPostavshik_Objektov_Component(){
        return postavshik_objektov_component;
    }

}
