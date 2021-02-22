import React from 'react';

const ArticleDetail = ({article, onFavouriteToggle}) => {

    if(!article){
        return <p>Select an article on "Brexit"</p>
    }

    return(
        <>
        <div className="article-detail">

            <div>
            <h2>{article.webTitle}</h2>
            <p>{ article.id }</p>
            <p>{ article.webUrl}</p>
            
            </div>

        
        </div>
        
        </>
    )
}
export default ArticleDetail;