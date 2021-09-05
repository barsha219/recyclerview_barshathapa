package com.example.recyclerview_barshathapa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcview;
    MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("CountryLists");

        rcview = findViewById(R.id.rcview);

        rcview.setLayoutManager(new LinearLayoutManager(this));

        adapter = new MyAdapter(lists1(),lists2(), getApplicationContext());

        rcview.setAdapter(adapter);
    }

    public ArrayList<Country> lists1(){
        ArrayList<Country> holder = new ArrayList<>();

        Country C1 = new Country();
        C1.setCountryName("Nepal");
        C1.setCcode("+977");
        C1.setFlagid(R.drawable.nep);
        holder.add(C1);

        Country C2 = new Country();
        C2.setCountryName("Argentina");
        C2.setCcode("+54");
        C2.setFlagid(R.drawable.arz);
        holder.add(C2);

        Country C3 = new Country();
        C3.setCountryName("Germany");
        C3.setCcode("+49");
        C3.setFlagid(R.drawable.ger);
        holder.add(C3);

        Country C4 = new Country();
        C4.setCountryName("Brazil");
        C4.setCcode("+55");
        C4.setFlagid(R.drawable.braz);
        holder.add(C4);

        Country C5 = new Country();
        C5.setCountryName("India");
        C5.setCcode("+91");
        C5.setFlagid(R.drawable.indd);
        holder.add(C5);

        Country C6 = new Country();
        C6.setCountryName("Pakistan");
        C6.setCcode("+92");
        C6.setFlagid(R.drawable.pak);
        holder.add(C6);

        Country C7 = new Country();
        C7.setCountryName("Portugal");
        C7.setCcode("+351");
        C7.setFlagid(R.drawable.port);
        holder.add(C7);

        Country C8 = new Country();
        C8.setCountryName("Spain");
        C8.setCcode("+34");
        C8.setFlagid(R.drawable.sp);
        holder.add(C8);

        Country C9 = new Country();
        C9.setCountryName("usa");
        C9.setCcode("+1");
        C9.setFlagid(R.drawable.usa);
        holder.add(C9);

        Country C10 = new Country();
        C10.setCountryName("slovakia");
        C10.setCcode("+421");
        C10.setFlagid(R.drawable.slo);
        holder.add(C10);

        return holder;
    }

    public ArrayList<CountryDetails> lists2() {
        ArrayList<CountryDetails> holder = new ArrayList<>();

        CountryDetails D1 = new CountryDetails();
        D1.setCname("Nepal");
        D1.setAreaa("147,516 km²");
        D1.setRel("Hindu");
        D1.setPop("28.61 million");
        D1.setDetails("Nepal, country of Asia, lying along the southern slopes of the Himalayan mountain ranges. It is a landlocked country located between India to the east, south, and west and the Tibet Autonomous Region of China to the north.Nepal falls in the temperate zone north of the Tropic of Cancer. ");
        D1.setFlag(R.drawable.nep);
        D1.setAnim("leopard, Rhesus monkey, langur, hyena, jackal, wild boar, antelope, wild cat, wolf, sloth bear, chital or spotted deer and barking deer.");
        D1.setBird("Himalayan Monal, Cheer Pheasant, Satyr Tragopan, Bengal Florican");
        holder.add(D1);


        CountryDetails D2 = new CountryDetails();
        D2.setCname("Argentina");
        D2.setAreaa("2.78 million km²");
        D2.setRel("Roman Catholic");
        D2.setPop("44.94 million");
        D2.setDetails("Argentina is a country in the southern half of South America. It shares the bulk of the Southern Cone with Chile to the west, and is also bordered by Bolivia and Paraguay to the north, Brazil to the northeast, Uruguay and the South Atlantic Ocean to the east, and the Drake Passage to the south.  ");
        D2.setFlag(R.drawable.arz);
        D2.setAnim("Moreno's Ground-Dove, Patagonian Hare, Andean Flamingo, Guanaco.");
        D2.setBird("Tinamous, Screamers, Ducks, Guans, New World quails.\n");
        holder.add(D2);

        CountryDetails D3 = new CountryDetails();
        D3.setCname("Germany");
        D3.setAreaa("357,386 km²");
        D3.setRel("Christianity");
        D3.setPop("83.02 million");
        D3.setDetails("Germany is a Western European country with a landscape of forests, rivers, mountain ranges and North Sea beaches. It has over 2 millennia of history. Berlin, its capital, is home to art and nightlife scenes. ");
        D3.setFlag(R.drawable.ger);
        D3.setAnim("European Pine Marten, European Wildcat, Wild Boar, European Badger");
        D3.setBird("Meadow Pipit, Eurasian Nuthatch, Tawny Owl, Meadow Pipit");
        holder.add(D1);


        CountryDetails D4 = new CountryDetails();
        D4.setCname("Brazil");
        D4.setAreaa("8,515,767.049 km2");
        D4.setRel("Roman Catholic");
        D4.setPop("211 million");
        D4.setDetails("Brazil, officially the Federative Republic of Brazil, is the largest country in both South America and Latin America. It covers an area of 8,515,767 square kilometres with a population of over 211 million.");
        D4.setFlag(R.drawable.braz);
        D4.setAnim("capybaras, sloths, monkeys, anteaters, pumas, jaguars");
        D4.setBird("Burrowing Owl, Amazon Kingfisher, Hyacinth Macaw, Toco Toucan");
        holder.add(D4);


        CountryDetails D5 = new CountryDetails();
        D5.setCname("India");
        D5.setAreaa("3.287 million km²");
        D5.setRel("Hinduism");
        D5.setPop("1.366 billion");
        D5.setDetails("India, officially the Republic of India, is a country in South Asia. It is the seventh-largest country by area, the second-most populous country, and the most populous democracy in the world.");
        D5.setFlag(R.drawable.indd);
        D5.setAnim("Peacock, Himalayan Wolf, Indian Sloth Bear, Bengal Tiger");
        D5.setBird("Indian peafowl, Tibetan eared pheasant, Grey peacock-pheasant");
        holder.add(D5);

        CountryDetails D6 = new CountryDetails();
        D6.setCname("Pakistan");
        D6.setAreaa("881,913 km²");
        D6.setRel("Muslim");
        D6.setPop("216.6 million");
        D6.setDetails("Pakistan, officially the Islamic Republic of Pakistan, is a country in South Asia. It is the world's fifth-most populous country, with a population exceeding 225.2 million, and has the world's second-largest Muslim population. Pakistan is the 33rd-largest country by area.");
        D6.setFlag(R.drawable.pak);
        D6.setAnim("Long-tailed Marmot, Bharal, Ladakh Pika, Pallas's Cat");
        D6.setBird("Indian peafowl, Pavo cristatus, Common quail, Coturnix");
        holder.add(D6);

        CountryDetails D7 = new CountryDetails();
        D7.setCname("Portugal");
        D7.setAreaa("92,212 km²");
        D7.setRel("Roman Catholic");
        D7.setPop("10.28 million");
        D7.setDetails("Portugal is a southern European country on the Iberian Peninsula, bordering Spain. Its location on the Atlantic Ocean has influenced many aspects of its culture: salt cod and grilled sardines are national dishes, the Algarve's beaches are a major destination.");
        D7.setFlag(R.drawable.port);
        D7.setAnim("Wild Goat, Iberian Wolf, White Stork");
        D7.setBird("Ducks, geese, and waterfowl");
        holder.add(D7);

        CountryDetails D8 = new CountryDetails();
        D8.setCname("Spain");
        D8.setAreaa("505,990 km²");
        D8.setRel("Catholicism");
        D8.setPop("46.94 million");
        D8.setDetails("Spain, a country on Europe’s Iberian Peninsula, includes 17 autonomous regions with diverse geography and cultures. Capital city Madrid is home to the Royal Palace and Prado museum, housing works by European masters. Segovia has a medieval castle and an intact Roman aqueduct.");
        D8.setFlag(R.drawable.sp);
        D8.setAnim("Eurasian Beaver, Spanish Ibex, Golden Eagle");
        D8.setBird("Magpie, Hoopoe, Robin, Common Linnet");
        holder.add(D8);


        CountryDetails D9 = new CountryDetails();
        D9.setCname("usa");
        D9.setAreaa("9.834 million km²");
        D9.setRel("Christianity");
        D9.setPop("328.2 million");
        D9.setDetails("The U.S. is a country of 50 states covering a vast swath of North America, with Alaska in the northwest and Hawaii extending the nation’s presence into the Pacific Ocean.Midwestern metropolis Chicago is known for influential architecture.");
        D9.setFlag(R.drawable.usa);
        D9.setAnim("Iberian Lynx, Brown Bear, Eurasian Beaver, Spanish Ibex");
        D9.setBird("Pigeons and doves");
        holder.add(D9);


        CountryDetails D10 = new CountryDetails();
        D10.setCname("Slovakia");
        D10.setAreaa("49,035 km²");
        D10.setRel("Catholic");
        D10.setPop("5.45 million");
        D10.setDetails("Slovakia, officially the Slovak Republic, is a landlocked country in Central Europe. It is bordered by Poland to the north, Ukraine to the east, Hungary to the south, Austria to the southwest, and the Czech Republic to the northwest");
        D10.setFlag(R.drawable.slo);
        D10.setAnim("squirrel, fox, wild-boar, lynx, wolf and bear");
        D10.setBird("Ducks, geese, Cuckoos and anis");
        holder.add(D10);

        return holder;
    }


}