package com.example.cookbook

import com.example.cookbook.model.recipe

val pilau = recipe(1,"Pilau",
        listOf("rice", "Beef", "spices of your choice"),
        R.drawable.pilau,
        "1.Boil the meat until tender. Sprinkle some salt to taste. \n" +
                "2.Once cooked, drain the remaining broth into a container and put aside.\n" +
                "3.Add the fat and onions. Cook for a couple of minutes.\n" +
                "4.Add freshly ground ginger and garlic then stir. \n" +
                "5.Add the tomatoes or tomato paste, then stir.\n" +
                "6.Let it cook for five to 10 minutes. \n" +
                "7.Add two level teaspoons of pure ground pilau masala and the dash of pepper. \n" +
                "8.Let the spicy mixture simmer for about three minutes. \n" +
                "9.Then add four to five cups of the meat broth.\n" +
                "10.Wash the rice. \n" +
                "11.After the water or broth has boiled, add the rice. \n" +
                "12.Cook under low heat until all water has dried up or until read"
    )

    val cookies = recipe(2,
        "cookies",
        listOf("Flour", "Chocolate", "Sugar" ,"Vanilla"),
        R.drawable.cookies_icon,
        "1.Heat the oven to 190C/170C fan/gas 5. \n" +
                "2.Cream the butter in a large bowl with a wooden spoon or in a stand mixer until it is soft. \n" +
                "3.Add the sugar and keep beating until the mixture is light and fluffy. \n" +
                "4.Sift in the flour and add the optional ingredients. \n" +
                "5.Bring the mixture together with your hands in a figure-of-eight motion until it forms a dough. \n" +
                "6.You can freeze the dough at this point.\n" +
                "7.Roll the dough into walnut-sized balls and place them slightly apart from each other on a baking sheet . \n" +
                "8.Flatten the balls a little with the palm of your hand \n" +
                "9.Bake them in the oven for around 10-12 mins until they are golden brown and slightly firm on top. \n" +
                "10.Leave the cookies on a cooling rack for around 15 mins before serving."
    )

    val cake = recipe(3,"cake",
        listOf("Flour", "Chocolate", "Sugar" ,"Vanilla", "Butter"),
        R.drawable.cake,
        "1.Heat the oven to 180C/160C fan/gas 4. \n" +
                "2.Oil three 20cm cake tins and line with baking parchment. \n" +
                "3.Weigh out the flour, cocoa powder, baking powder, bicarb and sugar into a large bowl \n" +
                "4.Add a pinch of salt and whisk gently to combine. \n" +
                "5.Shake the bowl to bring any lumps of sugar to the surface and squeeze these with your fingertips.\n" +
                "6.Measure the oil, milk, vinegar, coffee and vanilla into a jug, then add the eggs and whisk to combine.\n" +
                "7.Pour the wet ingredients into the dry and stir with a whisk until smooth, making sure there are no pockets of flour at the bottom of the bowl. \n" +
                "8.Divide the batter evenly between the prepared tins, then bake on the middle shelf of the oven (or middle and top if they don’t all fit on one shelf) for 25 mins. \n" +
                "9.Swap the tins around and bake 5 mins more.\n" +
                "10.Check the cakes are cooked by inserting a skewer into the centre of each – if any wet batter clings to the skewer, return the tins to the oven for another 5 mins, then check again. \n" +
                "11.Leave to cool in the tins for 30 mins, then turn the sponges out onto wire racks to cool completely. \n" +
                "\n" +
                "...For the buttercream... \n" +
                "\n" +
                "12.Beat the butter for a few minutes until smooth and creamy. \n" +
                "13.Add half the icing sugar and beat again to combine. \n" +
                "14.Add the remaining icing sugar, the vanilla and 4 tbsp milk and beat again to combine, adding a splash more milk if needed to make a smooth, fluffy buttercream. \n" +
                "15.Divide between three bowls and add a few drops of different food colouring paste to each bowl, then mix well.\n" +
                "16.Spoon the coloured buttercream mixtures into three separate piping bags and snip off the tips. \n" +
                "17.Pipe a dot of buttercream onto a cake stand or board and place a sponge on top to help keep it in place. \n" +
                "18.Pipe small blobs of purple buttercream all over the top of the sponge by holding the piping bag directly above the cake, \n" +
                "about ½cm from the surface, and squeezing the bag while pulling upwards to create a small peak.\n" +
                "19.Place the second sponge on top, then repeat the process with the pink buttercream. \n" +
                "20.Add the third sponge on top, then neatly pipe blobs of yellow buttercream over the surface. \n"
    )
    val rice = recipe(
        4,"Chinese coconut Rice",
        listOf("Jasmine rice", "Coconut water", "Sugar" ,"Salt"),
        R.drawable.chinese__coconut_rice_dessert_icon,
        "1.Add rice, coconut milk, water (or coconut water), sea salt, sugar (optional), and desiccated or shredded coconut (optional), to a large saucepan and bring to a boil over high heat. \n" +
                "2.Once boiling, lower heat to a simmer and cover. \n" +
                "3.Simmer until water is completely absorbed and rice is tender — about 20-25 minutes \n" +
                "4.Drain off excess water if there is any (there shouldn’t be).\n" +
                "5.Remove the lid, fluff with a fork, put the lid back on, and let rest for 10 minutes so the moisture redistributes to prevent mushy rice. \n" +
                "6.Taste test and add additional salt if desired. \n"
    )
    val ugali= recipe(5,"Ugali",
        listOf("Maize flour", "water"),
        R.drawable.ugali,
        "1. Bring water to a boil in a pot.\n" +
                "2. Add the maize meal and stir to prevent lumps.\n" +
                "3. Add more maize meal to make a thick porridge.\n" +
                "4. Keep stirring until the maize meal is well cooked.\n" +
                "5. Tip out onto a plate – the ugali should hold its shape."
    )


val allrecipes = listOf(pilau, cookies, cake,rice, ugali)