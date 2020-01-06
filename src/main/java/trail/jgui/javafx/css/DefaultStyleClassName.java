/*
 * Copyright 2017 JiaweiMao jiaweiM_philo@hotmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package trail.jgui.javafx.css;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * @author JiaweiMao
 * @version 1.0.0
 * @since 11 Jan 2018, 3:41 PM
 */
public class DefaultStyleClassName extends Application
{

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        Button btn = new Button();
        ObservableList<String> list = btn.getStyleClass();
        if (list.isEmpty()) {
            System.out.println("No default style class name");
        } else {
            for (String styleClassName : list) {
                System.out.println(styleClassName);
            }
        }
    }
}
