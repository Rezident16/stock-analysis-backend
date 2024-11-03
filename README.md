# Stocks Backend

## Overview




## Features TODO:

- [ ] Complete all models
- [ ] Complete all repositories
- [ ] Complete all services
- [ ] Complete all controllers
- [ ] Get Current Stock Price (different repo)
- [ ] Integrate beautiful soup to get data from finviz
- [ ] Integrate either through different repo or current repo trading bars to generate chart on the front-end

### Additional features to consider:
- [ ] Due to potential high frequency of requests across multiple servers we potentially need to grant user permissions to add new stocks to prevent users from generating unknown/random stocks.

## Completed Features 

- [ ] Able to make calls to generate stock patterns: https://github.com/Rezident16/StockAnalysisFlask
- [ ] Able to make calls to generate news and news analysis: https://github.com/Rezident16/News_Analysis

Both repos are written in Python(Flask) they utilize the following tools:

- Alpaca API to get trading bars, news per stock
- TA-Lib to perform trading bar analysis - currently able to catch patterns across several timeframes. Future implementations might follow.
- Hugging Face - to analize the news based on the content provided.
