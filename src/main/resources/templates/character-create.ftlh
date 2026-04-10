<!DOCTYPE html>
<html lang="en">
<head>
    <meta name ="viewport" content="width=device-width, initial scale=1.0">
    <meta charset="UTF-8">
   
    <title>Thunderbolts | new character form</title>
    <link rel ="stylesheet" href="/style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Fraunces:ital,opsz,wght@0,9..144,100..900;1,9..144,100..900&display=swap" rel="stylesheet">
    

</head>
<body>
        <!---Section for header-->
    <section class ="header">
        <nav>
           
            <div class = "nav-links">
                <ul>
                    <li> <a href="/ui/characters">Index</a></li>
                    <li> <a href="/ui/characters/details">Details</a></li>
                    <li> <a href="/ui/characters/about">About</a></li>
                    <li> <a href="/ui/characters/new">New character form</a></li>
                </ul>
            </div>
        </nav>

        <div class="text-box3">
            <h1> THUNDERBOLTS*</h1>

        </div>


    </section>

        <!---Section for creating a new character information-->

    <section class="newChar">
        <h1>New Character Form</h1>
        <p> Want to add a new character to this forum? Insert all the information below
            to add in a New Character!
        </p>

    <form class="char-form" action="/ui/characters/create" method="post">

        <label>Character Name</label>
        <input type="text" name="name" placeholder="e.g Bucky Barnes" required>

        <label>Universe</label>
        <input type="text" name="universe" placeholder="e.g Earth 616">

        <label>Species</label>
        <input type="text" name="species" placeholder="e.g Human">

        <label>Age</label>
        <input type="number" name="age" placeholder="e.g 30">

        <label>Image URL</label>
        <input type="text" name="image" placeholder="https://example.com/image.jpg">

        <label>Description</label>
        <textarea name="description" rows="5" placeholder="Brief description of the character..." required></textarea>

        <button type="submit">Add Character</button>

    </form>

        <!---You can write information for the class but it won't have a backend service-->
        
    </section>


</body>
</html>
