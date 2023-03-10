package SpringbootShell.dao;

import SpringbootShell.Model.Price;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SpringbootShellDAO
{
    List<Price> getPriceHistory(@Param("ticker") String ticker);

    Integer priceCount(@Param("ticker") String ticker, @Param("date") String date);

    List<String> getPurchaseHistory(@Param("ticker") String ticker);

    void recordPurchase(String ticker, String date);

    void setPriceHistory(@Param("ticker") String ticker, @Param("date") String date, @Param("price") String price);

    void resetPriceHistory(@Param("ticker") String ticker);

    void resetPurchaseHistory(@Param("ticker") String ticker);

    List<String> getTickers();
}
