package nbsidb.nearbyshops.org.RetrofitRESTContract;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import nbsidb.nearbyshops.org.ModelItemSpecification.ItemSpecificationItem;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by sumeet on 5/3/17.
 */

public interface ItemSpecItemService {


    @POST("/api/v1/ItemSpecificationItem")
    Call<ResponseBody> saveItemSpecName(@Header("Authorization") String headers,
                                        @Body ItemSpecificationItem itemSpecItem);



    @DELETE("/api/v1/ItemSpecificationItem")
    Call<ResponseBody> deleteItemSpecItem(@Header("Authorization") String headers,
                                          @Query("ItemSpecValueID")int itemSpecValueID,
                                          @Query("ItemID")int itemID);




    @GET ("/api/v1/ItemSpecificationItem")
    Call<List<ItemSpecificationItem>> getItemSpecName(
            @Query("ItemSpecNameID") Integer itemSpecNameID,
            @Query("ItemID") Integer itemID);

}
