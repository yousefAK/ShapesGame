# ShapesGame
**Multi client Colored shapes Game**

This is a small game in java, The server can handle many client and generate colored shapes randomly for them.
[see an example here](https://youtu.be/jGXzaRKGXUI)

The server form where we can add the height and the width of the client game board, the duration of the game and the speed of generating shapes. There are 3 shapes (circle, rectangle, triangle) and three colors (red, blue, yellow) and every form <shape, color> has a specific points generated randomly at the start of the game.

![GitHub Logo](/src/shapesgame/img/server.png)

Many Clients can join to the server.
When the server begin the game, the client boards appear and they should gain points by press on the appropriate shape, some shapes could make client lose points instead of gaining points. 

![GitHub Logo](/src/shapesgame/img/client.png)

![GitHub Logo](/src/shapesgame/img/client_game.png)
