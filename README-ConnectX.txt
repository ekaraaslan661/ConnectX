Header:
ConnectX
Yash Satyavarpu and Eren Karaaslan
5/7/17


Description:
A reboot of the classic family game, Connect Four. What makes this version different are the multiple game modes and exciting power-ups. The first mode is the classic Single Player against our own custom AI. Another mode will be a multiplayer mode alongside a player on the same computer, and another multiplayer mode utilizing networking. In addition, a special editor mode allows you to create your own setups and play through them. Finally, the player will have the option to play with power-ups such as deleting a piece or adding rows and columns to the gameboard. If the row and columns are increased, so does the amount of pieces needed to win, hence the name ConnectX. 


Instructions:
        Once the program runs, the user can select which one of the game modes they would like to play: Singleplayer, Multiplayer, Online, or Editor. Color will be randomly assigned, with Red going first. For Multiplayer mode, each user selects a username. For Singleplayer, Multiplayer, and Online, the player then uses the mouse to click the spot where they would like to place their piece.  The Editor mode acts as a practice arena in order to test new strategies and plan your next victory. In the Editor mode, the player selects which color they would like to use and can click the location where they would like to set the piece. Then, after hitting the “Play” button, the board can no longer be edited. In Multiplayer mode, players take turns using the mouse to click where their piece will be. In Online mode, the program will indicate whose turn it is, and then that player places their piece. The power-ups are: Must use Diagonal to win, Must use Horizontal to win, Must use Vertical to win, Add a column and a row, Add a time limit, Delete a piece. Power ups will randomly spawn on the board, and can be collected by placing a piece in that spot. In addition, each player starts with a random power-up, but can only carry one power-up at a time. At the start of the game, players have the option to play with power-ups or not. 


Features: 
Must-haves:
* An editor game mode where the player can edit the board in order to practice strategies or replay games
* A Multiplayer game mode with a player at the same computer
* A working power up system that spawns randomly, and a “bag” system to hold power-ups
* A working Connect Four game that correctly checks winners, draws, and losses, with the same rules as classic Connect Four
* A How-to-Play screen on the menu


Want-to-Haves:
* A networked game where you can play online against other players
* Different game themes, unlockable styles of pieces
* Saving/Loading games 
* Background music, with options to mute, alongside effects played when pieces are placed or broken
* A classic Singleplayer Connect Four game against an AI
Stretch: 
* AI an actual working AI that tries to win against you, instead of just randomly placing pieces
* A “dropping” animation for placing pieces
* A hint system based off the code for the AI
* 3-D Graphics, a more polished design instead of JOptionPanes
* A system that keeps track of your high scores in relation to time it took to win
Classes: 
Main - contains the main method and creates the window
ConnectXWindow - extends JFrame, contains the current board, as well as menus for instructions and game mode selecting
Menu - extends JFrame and shows players how to play, along with selecting game modes
SinglePlayer - extends GameBoard and loads a SinglePlayer game
Multiplayer - extends GameBoard and loads a MultiPlayer game
GameBoard - extends JPanel, contains PieceLocations, contains the game pieces, handles piece placement
Instructions- A class that represents instructions
SinglePlayerP - extends GameBoard and loads a SinglePlayer game with powerups, sets up random powerups
MultiPlayerP - extends GameBoard and loads a SinglePlayer game with powerups, sets up random powerups
Editor- extends GameBoard, and has methods to add and remove pieces
PieceLocation - Stores a piece based on coordinates, determines if a mouse click is inside a specific set of coordinates, 
Piece - stores color of piece, and has a PieceLocation, uses 1,2,3, to denote whether a spot is unfilled, filled with Black, filled with Red
PowerUp - stores all the types of powerups, extends GameBoard
ConnectCircle - represents a location on the board, a spot on the board that can hold a piece
Delete, Diagonal, Time, Vertical, Horizontal, AddDimension- Each represent a specific powerup


Responsibilities: 
Yash-Everything related to the GameBoard, Everything with Piece
Eren- Everything connected with each window of the game, Everything to do with Powerup


Classes to be done based on must haves:
Main
ConnectXWindow
Menu
MultiPlayer
GameBoard
MultiPlayerP
Editor
PieceLocation
Piece
ConnectCircle


Suggestions:
1. Explain the “special editor” mode better; seems ambiguous 
2. What is ConnectCircle? 
3. Extend different types of powerups from the PowerUp class in the UML.