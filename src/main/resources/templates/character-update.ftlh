<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thunderbolts | Update Character</title>
    <link rel="stylesheet" href="/style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link
        href="https://fonts.googleapis.com/css2?family=Fraunces:ital,opsz,wght@0,9..144,100..900;1,9..144,100..900&display=swap"
        rel="stylesheet">
</head>

<body>

    <!-- Header Section -->
    <section class="header">
        <nav>
            <div class="nav-links">
                <ul>
                    <li><a href="/ui/characters">Index</a></li>
                    <li><a href="/ui/characters/details">Details</a></li>
                    <li><a href="/ui/characters/about">About</a></li>
                    <li><a href="/ui/characters/new">New Character Form</a></li>
                </ul>
            </div>
        </nav>

        <div class="text-box">
            <h1>THUNDERBOLTS*</h1>
            <p>Update your favorite character information...</p>
        </div>
    </section>

    <!-- Character Update Form -->
    <section class="form-section">
        <h1>Update Character</h1>

        <form action="/ui/characters/update" method="post" class="update-form">

            <input type="hidden" name="characterId" value="${character.characterId}">

            <label>Name:</label>
            <input type="text" name="name" value="${character.name}" required>

            <label>Universe:</label>
            <input type="text" name="universe" value="${character.universe}">

            <label>Species:</label>
            <input type="text" name="species" value="${character.species}">

            <label>Age:</label>
            <input type="number" name="age" value="${character.age}" min="0">

            <label>Image URL:</label>
            <input type="text" name="image" value="${character.image}">

            <label>Description:</label>
            <textarea name="description" rows="6">${character.description}</textarea>

            <button type="submit" class="btn-submit">Update Character</button>

        </form>
    </section>

</body>

</html>
