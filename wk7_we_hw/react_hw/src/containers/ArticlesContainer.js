import React, {useState, useEffect} from 'react';
import ArticlesList from "../components/ArticlesList"
import ArticleDetail from "../components/ArticleDetail"


const ArticlesContainer = () => {

    const [allArticles, setAllArticles] = useState([]);
    const [selectedArticle, setSelecteArticle] = useState(null);

    const getArticles = () => {
        fetch('https://content.guardianapis.com/search?q=brexit&format=json&api-key=test')
        .then(res => res.json())
        .then(data => setAllArticles(data))
    }


    useEffect(() => {
        getArticles()
    }, [])

    const handleSelectedArticle = (article) => {
        setSelectedArticle(article)
    }


    return(
        <>
        <h1>The Guardian: Aritcles regarding "Brexit"</h1>
        <div className="articles-container">
        <ArticlesList allArticles={allArticles} onSelectedArticle={handleSelectedArticle}/>
        <ArticleDetail article={selectedArticle}/>
        </div>
      </>
    )
}

export default ArticlesContainer;