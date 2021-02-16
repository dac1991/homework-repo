import React from 'react';

const LinkBox = ({externalURL, externalLinkText}) => {
    return(
        <div className="link-box">
            <h2><a href={externalURL}>{externalLinkText}</a></h2>
        </div>

    );
};

export default LinkBox;