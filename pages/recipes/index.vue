<template>
    <div class="container">
        <h1>| Recipes page |</h1>
        <section class="recipes">
            <Recipe 
                v-for = "recipe in recipes"
                :key = "recipe.id"
                :thumbnail = "recipe.thumbnail"
                :title = "recipe.title"
                :id = "recipe.id"
                :previewText = "recipe.previewText"/>
        </section>
    </div>
</template>

<script>
import Recipe from '@/components/Recipe'

export default {
    components: {
        Recipe
    },
    asyncData() {//executed on the server before its showed to the client, this data should come from a server using axios
        return new Promise((resolve, reject) =>{
            setTimeout(() => {
                resolve({
                    recipes: [
                        {
                            id: "1",
                            thumbnail: "https://drop.ndtv.com/albums/COOKS/chicken-dinner/chickendinner_640x480.jpg",
                            title: "Fish meal",
                            previewText: "it is a italic fish with olives and tomatoes"
                        },
                        {
                            id: "2",
                            thumbnail: "https://cdn-image.foodandwine.com/sites/default/files/styles/4_3_horizontal_-_1200x900/public/2018-food-trends-ft-blog1117.jpg",
                            title: "Cramberry cakes",
                            previewText: "really unhealthy but o so delicious"
                        },
                        {
                            id: "3",
                            thumbnail: "https://www.samaa.tv/wp-content/uploads/2017/02/PAK-FOOD.jpg",
                            title: "Kebab schotel",
                            previewText: "meat from a fat pork"
                        }
                    ]
                })
            }, 1500)
        })
    }
};
</script>

<style scoped>
h1 {
    text-align: center;
}

.recipes {
    display: flex;
    flex-flow: row wrap;
    justify-content: center;
    align-items: flex-start;
}
</style>
