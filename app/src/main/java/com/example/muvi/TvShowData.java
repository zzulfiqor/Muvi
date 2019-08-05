package com.example.muvi;

import java.util.ArrayList;

public class TvShowData {
    private static String[][] data = new String[][]{
            {"The Flash","24","28 Mei 2019","Barry Allen, Frost, Vibe","https://m.media-amazon.com/images/M/MV5BMjI1MDAwNDM4OV5BMl5BanBnXkFtZTgwNjUwNDIxNjM@._V1_UY268_CR16,0,182,268_AL_.jpg"," After being struck by lightning, Barry Allen wakes up from his coma to discover he's been given the power of super speed, becoming the Flash, fighting crime in Central City. "},
            {"Game Of Throne","8","28 Mei 2019","Arya Stark, Emilia Klark","https://m.media-amazon.com/images/M/MV5BMjA5NzA5NjMwNl5BMl5BanBnXkFtZTgwNjg2OTk2NzM@._V1_UX182_CR0,0,182,268_AL_.jpg"," Nine noble families fight for control over the mythical lands of Westeros, while an ancient enemy returns after being dormant for thousands of years. "},
            {"Limitless","24","28 Mei 2019","Bradley Copper, Bradley Gold","https://m.media-amazon.com/images/M/MV5BYmViZGM0MGItZTdiYi00ZDU4LWIxNDYtNTc1NWQ5Njc2N2YwXkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_UY268_CR2,0,182,268_AL_.jpg"," With the help of a mysterious pill that enables the user to access one hundred percent of his brain abilities, a struggling writer becomes a financial wizard, but it also puts him in a new world with lots of dangers. "},
            {"Daredevil","24","28 Mei 2019","Charlie Cox, Deborah Ann Woll","https://m.media-amazon.com/images/M/MV5BODcwOTg2MDE3NF5BMl5BanBnXkFtZTgwNTUyNTY1NjM@._V1_UX182_CR0,0,182,268_AL_.jpg"," A blind lawyer by day, vigilante by night. Matt Murdock fights the crime of New York as Daredevil. "},
            {"Agent Of S.H.I.E.L.D","24","28 Mei 2019","Samuel L Jackson, Coulson","https://m.media-amazon.com/images/M/MV5BYjY1ZGI3MDItOTk5Zi00NTA4LWJlNjMtYWFkNDMxNWVlNjcxXkEyXkFqcGdeQXVyNTc4MjczMTM@._V1_UX182_CR0,0,182,268_AL_.jpg"," The missions of the Strategic Homeland Intervention, Enforcement and Logistics Division. "},
            {"Mr.Robot","25","28 Mei 2019","Rami Malek, Robot", "https://m.media-amazon.com/images/M/MV5BMTYzMDE2MzI4MF5BMl5BanBnXkFtZTgwNTkxODgxOTE@._V1_UX182_CR0,0,182,268_AL_.jpg", " Elliot, a brilliant but highly unstable young cyber-security engineer and vigilante hacker, becomes a key figure in a complex game of global dominance when he and his shadowy allies try to take down the corrupt corporation he works for. "},
            {"The Walking Dead","23","28 Mei 2019","Andrew Lincoln","https://m.media-amazon.com/images/M/MV5BNDM2OTA1NzIzMV5BMl5BanBnXkFtZTgwOTkxMTk5NjM@._V1_UX182_CR0,0,182,268_AL_.jpg"," Sheriff Deputy Rick Grimes wakes up from a coma to learn the world is in ruins, and must lead a group of survivors to stay alive."},
            {"Chernobyl","5","28 Mei 2019","Jessie Buckley, Jared Harris","https://m.media-amazon.com/images/M/MV5BNTEyYmIzMDUtNWMwNC00Y2Q1LWIyZTgtMGY1YzUxOTAwYTAwXkEyXkFqcGdeQXVyMjIyMTc0ODQ@._V1_UX182_CR0,0,182,268_AL_.jpg"," In April 1986, an explosion at the Chernobyl nuclear power plant in the Union of Soviet Socialist Republics becomes one of the world's worst man-made catastrophes. "},
            {"Titans","12","28 Mei 2019","Brenton Thwatief, Anna Diop","https://m.media-amazon.com/images/M/MV5BMTU0NDc4Mjc4N15BMl5BanBnXkFtZTgwNjcyNTM0NjM@._V1_UX182_CR0,0,182,268_AL_.jpg"," A team of young superheroes led by Nightwing (formerly Batman's first Robin) form to combat evil and other perils. "},
            {"Arrow","24","28 Mei 2019","Stephen Amell, Cathy","https://m.media-amazon.com/images/M/MV5BZDc5N2M3OTMtYmJmMy00MzczLWJmMTktZGNkYzlhNDczZWEzXkEyXkFqcGdeQXVyNjg3MDMxNzU@._V1_UX182_CR0,0,182,268_AL_.jpg"," Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow. "}
    };

    public static ArrayList<TvShowModel> getListData(){
        ArrayList<TvShowModel> list = new ArrayList<>();
        for (String[] aData : data){
            TvShowModel show = new TvShowModel();
            show.setTitle(aData[0]);
            show.setEpisode(aData[1]);
            show.setRelease(aData[2]);
            show.setCast(aData[3]);
            show.setPoster(aData[4]);
            show.setDescription(aData[5]);
            list.add(show);
        }
        return list;
    }
}
