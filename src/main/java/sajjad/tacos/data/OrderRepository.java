package sajjad.tacos.data;

import sajjad.tacos.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
