package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    HBox hbox = new HBox();

    Button leftButton = new Button("cabin");
    Button rightButton = new Button("dungeon");

    Label label = new Label("You have a choice between two different stories. You can either experience the dungeon story, or the cabin story.");


    GridPane grid = new GridPane();
    Scene scene = new Scene(grid, 1300, 800);

    int timesClicked;
    boolean haveKey = false;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setScene(scene);

        initGame();


        primaryStage.show();
    }

    void dungeon() {
        setRightButton("right");
        setLeftButton("left");
        setLabel("You find yourself in an empty room. There are two doors, on to your right and one to your left. Which do you chose?");

        rightButton.setOnAction(event -> {
            setLabel("You enter a room that is completely bare. There is no door or any decoration. The only furnishing is a rug on the floor. What do you do?");
            setRightButton("Check under the rug");
            setLeftButton("Return back to the room you came from.");

            rightButton.setOnAction(event1 -> {
                setLabel("You find a key. How lucky. I mean it doesn't really matter because you are going to die at the end of this game anyways. But cool, good for you.");
                setRightButton("Check under the rug again for some reason. Why would you do this actually.");
                setLeftButton("leave room");
                haveKey = true;
                rightButton.setOnAction(event2 -> {
                    setLabel("why are you doing this");
                    timesClicked++;
                    if(timesClicked > 3){
                        setLabel("pls stop");
                    }
                    if (timesClicked > 7) {
                        setLabel("end me fam");
                    }
                    if (timesClicked > 69) {
                        setLabel("this is why the United States government is trillions of dollars in debt");
                    }
                    if (timesClicked > 100) {
                        setLabel("There is nothing after this, but if you are committed enough to click it this many times, Im sure this disclaimer wont stop you");
                    }
                    if (timesClicked > 1000) {
                        setLabel("There really is nothing after this please stop. You are actually damaging your mouse.");
                    }
                    if (timesClicked > 1000000) {
                        setLabel("Do you need mental therapy? Are you ok? Do you need someone to talk to? My phone number is 559-246-5660. Text me if you need to talk.");
                    }
                });
                leftButton.setOnAction(event2 -> {
                    dungeon();
                });

            });

            leftButton.setOnAction(event1 -> {
                dungeon();
            });
        });

        leftButton.setOnAction(event -> {
            setLabel("You enter a room that is decorated with abstract feminist posters. Lord help you. There is a door directly across from you. What do you do?");
            setRightButton("Try to open the door");
            setLeftButton("Go back to where you came from. (Donald Trump Option)");

            rightButton.setOnAction(event1 -> {
                if(!haveKey){
                    setLabel("The door is locked. It needs a key. I wonder where you will get that. " +
                            "Maybe if your reasoning skills are above that of a two year old you will figure it out.");
                }
                if(haveKey){
                    setLabel("You see a figure at the end of a hallway that looks decently spooky. What do you do?");
                    setRightButton("360 No Scope for dominance");
                    setLeftButton("Level up your sneak ability and sneak sneak past.");

                    rightButton.setOnAction(event2 -> {
                        setLabel("You actually hurt the dudes feelings. Just because someone is ugly doesn't mean you can shoot them. I legitamately need to have a conversation with your mother.");
                        setRightButton("feels bad man");
                        setLeftButton("you lose this one");

                        rightButton.setOnAction(event3 -> {
                            haveKey = false;
                            initGame();
                        });
                        leftButton.setOnAction(event3 -> {
                            haveKey = false;
                            initGame();
                        });
                    });

                    leftButton.setOnAction(event2 -> {
                        setLabel("You sneak past him and through an open door. You rush in and shut the door behind you. You look up and see two skelly bellies charging you.");
                        setRightButton("Grab sword off table");
                        setLeftButton("Grab magic gauntlet off table");

                        rightButton.setOnAction(event3 -> {
                            setLabel("Oh dang my dude, you gg wreck the skelly bellies. Feels dank man. There is a door at the end of the room. What do you do?");
                            setLeftButton("loot bodies");
                            setRightButton("leave room");

                            leftButton.setOnAction(event4 -> {
                                setLabel("Do you really want to grope them after you just killed them?");

                                setRightButton("yes");
                                setLeftButton("no");

                                rightButton.setOnAction(event5 -> {
                                    setLabel("You lose this one");
                                    setRightButton("feels bad");
                                    setLeftButton("This game is very poorly made. You get 1 star on yelp.");

                                    leftButton.setOnAction(event6 -> {
                                        initGame();
                                    });
                                    rightButton.setOnAction(event6 -> {
                                        initGame();
                                    });
                                });

                                leftButton.setOnAction(event5 -> {
                                    setLabel("That's what I thought. Oh wait, the door has some spooky spikes. But there is a lever on the wall");

                                    setRightButton("Pull lever");
                                    setLeftButton("Go through door anyways");

                                    rightButton.setOnAction(event6 -> {
                                        setLabel("Spikes fall from the ceiling. Killing you instantly. GG");

                                        setRightButton("Is there even a way to win this game?");
                                        setLeftButton("No");
                                    });

                                    leftButton.setOnAction(event6 -> {
                                        setLabel("You actually walk into the spikes and die. Your reasoning skills omg. Got me tilted atm.");

                                        setRightButton("back to start");
                                        setLeftButton("feels bad");

                                        rightButton.setOnAction(event7 -> {
                                            initGame();
                                        });
                                        leftButton.setOnAction(event7 -> {
                                            initGame();
                                        });
                                    });
                                });

                            });
                            rightButton.setOnAction(event4 -> {
                                setLabel("You enter the room and die immediately, that's it. That's all this game is. You die. There is no other story to it. Dont try and look for more story.");
                                setRightButton("OK?");
                                setLeftButton("You should totally get an A on this. This is very well done. Bravo.");

                                rightButton.setOnAction(event5 -> {
                                    initGame();
                                    haveKey = false;
                                });

                                leftButton.setOnAction(event5 -> {
                                    initGame();
                                    haveKey = false;
                                });
                            });
                        });

                        leftButton.setOnAction(event3 -> {
                            setLabel("I literally have no idea what a gauntlet is, I just hear people talk about it for games like this. Um you die? Feels bad");
                            setRightButton("Im sorry");
                            setLeftButton("This was literally made in one day");

                            rightButton.setOnAction(event4 -> {
                                initGame();
                            });
                            leftButton.setOnAction(event4 -> {
                                initGame();
                            });
                        });
                    });
                }
            });

            leftButton.setOnAction(event2 -> {
                dungeon();
            });

        });
    }



    void cabin() {

    }

    void setLabel(String in) {
        label.setText(in);
    }

    void setLeftButton(String in) {
        leftButton.setText(in);
    }

    void setRightButton(String in) {
        rightButton.setText(in);
    }

    void initGame() {
        hbox.getChildren().addAll(leftButton, rightButton);
        hbox.setSpacing(10);
        hbox.setPadding(new Insets(100, 0, 0, 350));

        grid.setHgap(10);
        grid.setVgap(12);

        HBox hbButtons = new HBox();
        hbButtons.setSpacing(10.0);
        hbButtons.setAlignment(Pos.CENTER);
        hbButtons.getChildren().addAll(leftButton, rightButton);

        grid.add(label, 0, 0);
        grid.add(hbButtons, 0, 2, 2, 1);
        grid.setAlignment(Pos.CENTER);

        setLabel("New Game?");
        setRightButton("Exit");
        setLeftButton("Start");

        leftButton.setOnAction(event ->{
            dungeon();
        });

        rightButton.setOnAction(event -> {
            System.exit(0);
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
