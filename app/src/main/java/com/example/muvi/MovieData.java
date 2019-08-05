package com.example.muvi;

import java.util.ArrayList;

public class MovieData {
    private static String[][] data = new String[][]{
            {"Iron Man","120","26 September 2010","Robert Downey Jr, Tony Stark, Poppins","https://m.media-amazon.com/images/M/MV5BMTczNTI2ODUwOF5BMl5BanBnXkFtZTcwMTU0NTIzMw@@._V1_UX182_CR0,0,182,268_AL_.jpg","After being held captive in an Afghan cave, billionaire engineer Tony Stark creates a unique weaponized suit of armor to fight evil. "},
            {"Iron Man 2","120","27 Oktober 2012","Robert Downey Jr, Tony Stark, Poppins","https://m.media-amazon.com/images/M/MV5BMTM0MDgwNjMyMl5BMl5BanBnXkFtZTcwNTg3NzAzMw@@._V1_UX182_CR0,0,182,268_AL_.jpg","With the world now aware of his identity as Iron Man, Tony Stark must contend with both his declining health and a vengeful mad man with ties to his father's legacy. "},
            {"Iron Man 3","150","28 November 2014","Robert Downey Jr, Tony Stark, Poppins","https://m.media-amazon.com/images/M/MV5BMjE5MzcyNjk1M15BMl5BanBnXkFtZTcwMjQ4MjcxOQ@@._V1_UY190_CR2,0,128,190_AL_.jpg","When Tony Stark's world is torn apart by a formidable terrorist called the Mandarin, he starts an odyssey of rebuilding and retribution. "},
            {"Captain America : First Avenger","120","25 April 2011","Chris Evan, Steve Rogers, Samuel L Jackson","https://m.media-amazon.com/images/M/MV5BMTYzOTc2NzU3N15BMl5BanBnXkFtZTcwNjY3MDE3NQ@@._V1_UX182_CR0,0,182,268_AL_.jpg"," Steve Rogers, a rejected military soldier transforms into Captain America after taking a dose of a \"Super-Soldier serum\". But being Captain America comes at a price as he attempts to take down a war monger and a terrorist organization. "},
            {"Captain America : The Winter Soldier","140","26 Mei 2013","Chris Evan, Steve Rogers, Samuel L Jackson","https://m.media-amazon.com/images/M/MV5BMzA2NDkwODAwM15BMl5BanBnXkFtZTgwODk5MTgzMTE@._V1_UY190_CR1,0,128,190_AL_.jpg"," As Steve Rogers struggles to embrace his role in the modern world, he teams up with a fellow Avenger and S.H.I.E.L.D agent, Black Widow, to battle a new threat from history: an assassin known as the Winter Soldier. "},
            {"Captain America : Civil War","160","27 Juni 2015","Chris Evan, Steve Rogers, Samuel L Jackson","https://m.media-amazon.com/images/M/MV5BMjQ0MTgyNjAxMV5BMl5BanBnXkFtZTgwNjUzMDkyODE@._V1_UY190_CR0,0,128,190_AL_.jpg"," Political involvement in the Avengers' affairs causes a rift between Captain America and Iron Man. "},
            {"Thor","150","24 Maret 2012","Chris Hemsworth, Anthony Hopkins, Natalie Portman","https://m.media-amazon.com/images/M/MV5BOGE4NzU1YTAtNzA3Mi00ZTA2LTg2YmYtMDJmMThiMjlkYjg2XkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_UX182_CR0,0,182,268_AL_.jpg"," The powerful but arrogant god Thor is cast out of Asgard to live amongst humans in Midgard (Earth), where he soon becomes one of their finest defenders. "},
            {"Thor : The Dark World","160","25 April 2014","Chris Hemsworth, Anthony Hopkins, Natalie Portman","https://m.media-amazon.com/images/M/MV5BMTQyNzAwOTUxOF5BMl5BanBnXkFtZTcwMTE0OTc5OQ@@._V1_UY268_CR3,0,182,268_AL_.jpg"," When Dr. Jane Foster (Natalie Portman) gets cursed with a powerful entity known as the Aether, Thor is heralded of the cosmic event known as the Convergence and the genocidal Dark Elves. "},
            {"Thor : Ragnarok","180","26 Mei 2016","Chris Hemsworth, Anthony Hopkins, Natalie Portman","https://m.media-amazon.com/images/M/MV5BMjMyNDkzMzI1OF5BMl5BanBnXkFtZTgwODcxODg5MjI@._V1_UX182_CR0,0,182,268_AL_.jpg"," Thor (Chris Hemsworth) is imprisoned on the planet Sakaar, and must race against time to return to Asgard and stop Ragnarök, the destruction of his world, at the hands of the powerful and ruthless villain Hela (Cate Blanchett). "},
            {"Doctor Strange","120","27 Juni 2016","Benedict Cumberbatch, Chiwetel Ejiofor, Rachel McAdams","https://m.media-amazon.com/images/M/MV5BNjgwNzAzNjk1Nl5BMl5BanBnXkFtZTgwMzQ2NjI1OTE@._V1_UX182_CR0,0,182,268_AL_.jpg"," While on a journey of physical and spiritual healing, a brilliant neurosurgeon is drawn into the world of the mystic arts. "}
    };

    public static ArrayList<MovieModel> getListData(){
        ArrayList<MovieModel> list = new ArrayList<>();
        for (String[] aData : data){
            MovieModel movie = new MovieModel();
            movie.setTitle(aData[0]);
            movie.setDuration(aData[1]);
            movie.setRelease(aData[2]);
            movie.setCast(aData[3]);
            movie.setPoster(aData[4]);
            movie.setDescription(aData[5]);
            list.add(movie);
        }
        return list;
    }
}
