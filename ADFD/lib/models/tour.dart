import 'dart:ffi';

class Tour{
  final String placeName;
  final String description;
  final int star;
  final double price;
  const Tour(this.placeName,this.description,this.star,this.price);


  factory Tour.fromJson(Map<String, dynamic> json) {
    return Tour(
        json['placeName'], json['description'], json['star'], json['price']);
  }
}
