import React, {useState} from 'react';
import FilmList from '../components/FilmList';
import LinkBox from '../components/LinkBox';

const FilmBox = () => {

    const [allFilms, setAllFilms] = useState(
        [
            {
                id: 1,
                name: "Spider-Man: Into the Spider-Verse",
                url: "https://www.imdb.com/title/tt4633694/?ref_=rlm"
            },
            {
                id: 2,
                name: "Life Itself",
                url: "https://www.imdb.com/title/tt5989218/?ref_=rlm"
            },
            {
                id: 3,
                name: "Mary Queen of Scots",
                url: "https://www.imdb.com/title/tt2328900/?ref_=rlm"
            },
            {
                id: 4,
                name: "The Lego Movie 2: The Second Part", url: "https://www.imdb.com/title/tt3513498/?ref_=rlm"
            },
            {
                id: 5,
                name: "Captain Marvel",
                url: "https://www.imdb.com/title/tt4154664/?ref_=rlm"
            }
     
        ]

    );

    const [externalURL, setExternalURL] = useState("https://www.imdb.com/calendar/?region=gb");

    const [externalLinkText, setExternalLinkText] = useState("View more upcoming releases >>");

    return(
        <div className="film-box">
            <h2 className="list-heading">Upcoming Film Releases for UK (2019)</h2>
            <hr />
            <FilmList allFilms={allFilms}/>
            <hr />
            <LinkBox externalURL={externalURL} externalLinkText={externalLinkText} />
        </div>

    )

};

export default FilmBox;