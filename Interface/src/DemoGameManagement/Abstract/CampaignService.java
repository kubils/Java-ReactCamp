package DemoGameManagement.Abstract;

import DemoGameManagement.Entity.Campaign;

public interface CampaignService {

    void save(Campaign campaign);
    void update(Campaign campaign);
    void delete(Campaign campaign);
}
