package ru.andreyv.my_di_project.Dagger;

import dagger.Module;
import dagger.Provides;
import ru.andreyv.my_di_project.LoadData.LoadData;

/**
 * Created by voran on 28.12.17.
 */

@Module
public class LoadDataModule {
    @Provides
    LoadData providesLoadData(){
        return new LoadData();
    }
}
