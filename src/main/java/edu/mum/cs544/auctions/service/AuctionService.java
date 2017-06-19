package edu.mum.cs544.auctions.service;

import edu.mum.cs544.auctions.dao.AuctionDAO;
import edu.mum.cs544.auctions.domain.Auction;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Mo Nuaimat <nuaimat@gmail.com>
 * nuaimat on 6/19/17.
 */
@Service
@Transactional(value = Transactional.TxType.REQUIRES_NEW)
public class AuctionService implements IAuctionService {
    private AuctionDAO auctionDao;

    public AuctionService(AuctionDAO auctionDAO) {
        this.auctionDao = auctionDAO;
    }


    @Override
    public Auction getAuction(int aid) {
        return auctionDao.getOne(aid);
    }

    @Override
    public Auction saveAuction(Auction a) {
        return this.auctionDao.save(a);
    }
}