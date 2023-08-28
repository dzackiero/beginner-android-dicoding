package com.pnj.beginnerprojectdicoding.data

import com.pnj.beginnerprojectdicoding.R
import com.pnj.beginnerprojectdicoding.model.Content

class Datasource {

    fun getContents() = listOf<Content>(
        Content(
            R.drawable.poster1,
            "Spider-Man: Across the Spider-Verse",
            2023,
            "After reuniting with Gwen Stacy, Brooklyn’s full-time, friendly neighborhood Spider-Man is catapulted across the Multiverse, where he encounters the Spider Society, a team of Spider-People charged with protecting the Multiverse’s very existence. But when the heroes clash on how to handle a new threat, Miles finds himself pitted against the other Spiders and must set out on his own to save those he loves most.",
            listOf("Animation","Action","Adventure"),
            8.5,
            "https://www.youtube.com/watch?v=shW9i6k8cB0&t=18s",
            "https://www.themoviedb.org/movie/569094-spider-man-across-the-spider-verse",
        ),
        Content(
            R.drawable.poster2,
            "Ahsoka",
            2023,
            "After the fall of the Galactic Empire, former Jedi Knight Ahsoka Tano investigates an emerging threat to a vulnerable galaxy.",
            listOf("Action", "Adventure", "Sci-fi", "Drama"),
            8.2,
            "https://www.youtube.com/watch?v=J_1EXWNETiI",
            "https://www.themoviedb.org/tv/114461-ahsoka"
        ),
        Content(
            R.drawable.poster3,
            "The Flash",
            2023,
            "When his attempt to save his family inadvertently alters the future, Barry Allen becomes trapped in a reality in which General Zod has returned and there are no Super Heroes to turn to. In order to save the world that he is in and return to the future that he knows, Barry's only hope is to race for his life. But will making the ultimate sacrifice be enough to reset the universe?",
            listOf("Action","Adventure","Science Fiction"),
            7.0,
            "https://www.youtube.com/watch?v=hebWYacbdvc",
            "https://www.themoviedb.org/movie/298618-the-flash"
        ),
        Content(
            R.drawable.poster4,
            "Insidious: The Red Door",
            2023,
            "To put their demons to rest once and for all, Josh Lambert and a college-aged Dalton Lambert must go deeper into The Further than ever before, facing their family's dark past and a host of new and more horrifying terrors that lurk behind the red door.",
            listOf("Horror", "Mystery", "Thriller"),
            6.9,
            "https://www.youtube.com/watch?v=ZuQuOnYnr3Q",
            ""
        ),
        Content(
            R.drawable.poster5,
            "Tranformers: Rise of the Beasts",
            2023,
            "When a new threat capable of destroying the entire planet emerges, Optimus Prime and the Autobots must team up with a powerful faction known as the Maximals. With the fate of humanity hanging in the balance, humans Noah and Elena will do whatever it takes to help the Transformers as they engage in the ultimate battle to save Earth.",
            listOf("Action", "Adventure", "Science Fiction"),
            7.5,
            "https://www.youtube.com/watch?v=itnqEauWQZM",
            "https://www.themoviedb.org/movie/614479-insidious-the-red-door"
        ),
        Content(
            R.drawable.poster6,
            "Guardian of the Galaxy Vol.3",
            2023,
            "Peter Quill, still reeling from the loss of Gamora, must rally his team around him to defend the universe along with protecting one of their own. A mission that, if not completed successfully, could quite possibly lead to the end of the Guardians as we know them.",
            listOf("Science Fiction", "Adventure", "Action", "Comedy"),
            8.0,
            "https://www.youtube.com/watch?v=JqcncLPi9zw",
            ""
        ),
        Content(
            R.drawable.poster7,
            "John Wick: Chapter 4",
            2023,
            "With the price on his head ever increasing, John Wick uncovers a path to defeating The High Table. But before he can earn his freedom, Wick must face off against a new enemy with powerful alliances across the globe and forces that turn old friends into foes.",
            listOf("Action", "Thriller", "Crime"),
            7.8,
            "https://www.youtube.com/watch?v=yjRHZEUamCc",
            "https://www.themoviedb.org/movie/447365-guardians-of-the-galaxy-vol-3"
        ),
        Content(
            R.drawable.poster8,
            "Puss in Boots: The Last Wish",
            2022,
            "Puss in Boots discovers that his passion for adventure has taken its toll: He has burned through eight of his nine lives, leaving him with only one life left. Puss sets out on an epic journey to find the mythical Last Wish and restore his nine lives.",
            listOf("Animation", "Family", "Fantasy", "Adventure", "Comedy", "Action"),
            8.3,
            "https://www.youtube.com/watch?v=1o8GWhoD53I",
            "https://www.themoviedb.org/movie/315162-puss-in-boots-the-last-wish"
        ),
        Content(
            R.drawable.poster9,
            "M3GAN",
            2022,
            "A brilliant toy company roboticist uses artificial intelligence to develop M3GAN, a life-like doll programmed to emotionally bond with her newly orphaned niece. But when the doll's programming works too well, she becomes overprotective of her new friend with terrifying results.",
            listOf("Science Fiction", "Horror"),
            7.2,
            "https://www.youtube.com/watch?v=OoDHM_A1axc",
            "https://www.themoviedb.org/movie/536554-m3gan"
        ),
        Content(
            R.drawable.poster10,
            "Suzume",
            2022,
            "Suzume, 17, lost her mother as a little girl. On her way to school, she meets a mysterious young man. But her curiosity unleashes a calamity that endangers the entire population of Japan, and so Suzume embarks on a journey to set things right.",
            listOf("Animation", "Drama", "Adventure", "Fantasy"),
            8.0,
            "https://www.youtube.com/watch?v=5pTcio2hTSw",
            "https://www.themoviedb.org/movie/916224"
        )
    )
}