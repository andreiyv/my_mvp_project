package ru.andreyv.my_di_project.Dagger;

import dagger.Module;
import dagger.Provides;
import ru.andreyv.my_di_project.SetString.SetString;

/**
 * Created by voran on 27.12.17.
 */

// Модуль провайдит зависимости. То есть именно в модулях мы прописываем, какие объекты хотим предоставлять

@Module
public class SetStringModule {
@Provides
SetString providesSetString(){
    return new SetString();
}
}
