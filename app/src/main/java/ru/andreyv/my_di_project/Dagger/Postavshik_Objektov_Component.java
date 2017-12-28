package ru.andreyv.my_di_project.Dagger;

import dagger.Component;
import ru.andreyv.my_di_project.MainActivity;

/**
 * Created by voran on 27.12.17.
 */

// Компонент являет собой граф зависимостей. Он объединяет модули и предоставляет зависимости нуждающимся классам (MainActivity)
// @Component по сути является мостом между @Module и @Inject

@Component(modules={SetStringModule.class, LoadDataModule.class})
public interface Postavshik_Objektov_Component {
    void inject(MainActivity activity);
}

