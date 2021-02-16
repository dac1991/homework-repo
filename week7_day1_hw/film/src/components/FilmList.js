import React from 'react';
import Film from './Film';

const FilmList = ({allFilms}) => {

    const filmNodes = allFilms.map((film) => {
        return(
            <Film name={film.name} url={film.url} key={film.id} />
        )

    });

    return(
            <ul className="film-list">
                {filmNodes}
            </ul>
        );
};

export default FilmList;