# JAVA FX TEMPLATE MENU
This is a simple structured javaFX menu template.  

## How does it work? 

1. Create a fxml view, with a container as root.

3. Create a Controller for the view. ( do not link the controller in 
the fxml! This will later be done through data binding(3))

3. Create a new Enum attribute in View/ViewList.java, 
parse the fxml file name, controller name in the enum. EX

```JAVA
MENU("MenuView.fxml",MenuController.getInstance());
```
Note that the controller in this example is a singleton. 


## TODO
1. Load css style thrugh view loader 
2. make a way to create ALERTS
