<!DOCTYPE html>
<html lang="en">

<head>
    <meta name="viewport" content="width=device-width, initial scale=1.0">
    <meta charset="UTF-8">

    <title>Thunderbolts | new character form</title>
    <link rel="stylesheet" href="/style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link
        href="https://fonts.googleapis.com/css2?family=Fraunces:ital,opsz,wght@0,9..144,100..900;1,9..144,100..900&display=swap"
        rel="stylesheet">


</head>

<body>
    <!---Section for header-->
    <section class="header">
        <nav>

            <div class="nav-links">
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
    <section class="InfoChar">

    <h1>All Characters</h1>

    <div class="card-container">

    <#list characterList as character>

        <div class="character-card">

            <h2>${character.name}</h2>

            <img src="${(character.image?? && character.image?trim?has_content)?then(character.image?trim, '/photos/default.jpg')}"width="200"height="280">
            <p><b>Species:</b> ${character.species!"N/A"}</p>
            <p><b>Age:</b> ${character.age!"N/A"}</p>
            <p><b>Description:</b> ${character.description!"N/A"}</p>

            <div class="card-buttons">
                <a href="/ui/characters/updateForm/${character.characterId}">
                    <button>Update</button>
                </a>

                <a href="/ui/characters/delete/${character.characterId}">
                    <button class="delete-btn">Delete</button>
                </a>
            </div>

        </div>

    </#list>

    </div>

</section>

</html>
