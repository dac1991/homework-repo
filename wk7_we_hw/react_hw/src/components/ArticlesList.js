import React from 'react';

const ArticlesList = ({allArticles, onSelectedArticle}) => {

    const articleListItems = allArticles.map((article, index) => {
        return <li onClick={() => {onSelectedArticle(article)}} key={index}>{article.name}</li>
    })


    return(
        <div className="article-list">
        <ul>
            {articleListItems}
        </ul>
        </div>
    )
}

export default ArticlesList;