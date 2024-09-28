const mongoose=require("mongoose");
const Schema=mongoose.Schema;

const listingSchema=new Schema({
    title:{
        type: String,
        require:true,
    },
    description:String,
    image:{
        type:String,
        default:"https://unsplash.com/photos/a-sunset-view-of-the-great-wall-of-china-Zm_tEAh3gG0",
        set : (v)=>v===""?"https://unsplash.com/photos/a-sunset-view-of-the-great-wall-of-china-Zm_tEAh3gG0":v,
    },
    price: Number,
    location:String,
    country:String,
});

const Listing=mongoose.model("Listing",listingSchema);
module.exports=Listing;