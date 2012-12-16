using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fleamart.Dal.Dao
{
    public interface IDAO<T>
    {
        bool Create(T entity);
        T Read(int id);
        bool Update(T entity);
        bool Delete(int id);
        List<T> List();
    }
}
