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

package trail.jgui.javafx.layout;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * HBox alignment=Pos.BOTTOM_RIGHT
 * HBox 的 preferred size 比子节点略大
 *
 * @author JiaweiMao
 * @version 1.0.0
 * @since 13 Apr 2018, 4:31 PM
 */
public class HBoxAlignmentEx1 extends Application
{

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        Button okBtn = new Button("OK");
        Button cancelBtn = new Button("Cancel");

        HBox hbox = new HBox(10);
        hbox.setPrefSize(200, 100);
        hbox.getChildren().addAll(okBtn, cancelBtn);

        // Set the alignment to bottom right
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        hbox.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");
        Scene scene = new Scene(hbox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Using HBox Alignment Property");
        primaryStage.show();
    }
}
